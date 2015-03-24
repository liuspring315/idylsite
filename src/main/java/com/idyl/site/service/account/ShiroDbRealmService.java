package com.idyl.site.service.account;

import com.idyl.site.data.UserGeneralInfo;
import com.idyl.site.data.UserTypeEnum;
import com.idyl.site.service.account.AccountService;
import com.idyl.site.util.SpringContextUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import java.util.Arrays;
import java.util.Map;

/**
 *
 * 作成日期： 2012-8-16 
 * <p>功能描述: 自实现用户与权限查询</p>
 * @author  liuzhaocun
 * @version 0.1
 */
public class ShiroDbRealmService extends AuthorizingRealm {
    public static final String NAME = "ShiroDbRealmService";


    /**
     * 认证回调函数, 登录时调用.
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
        String password = new String(token.getPassword());
        String username = token.getUsername();
        if (username == null) {
            throw new AccountException("用户名不能为空");
        }
	    String[] arrStr = username.split(",");
	    Integer userType = Integer.parseInt(arrStr[0]);
	    AccountService accountService = (AccountService) SpringContextUtil.getBean(UserTypeEnum.getUserTypeEnum(userType).getDaoClassName());

	    UserGeneralInfo user = accountService.findByLoginName(username,password);
//
        if (user == null) {
            throw new UnknownAccountException("用户不存在");
        }
        return new SimpleAuthenticationInfo(user,password,NAME);

    }


    /**
     *
     * 当用户进行访问链接时的授权方法
     *
     */
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        Map<String,Object> user = (Map<String,Object>) principals.fromRealm(getName()).iterator().next();


        if (user != null) {

            SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();

            info.addStringPermission("common-user");

            return info;

        } else {

            return null;

        }

    }

    /**
     * 更新用户授权信息缓存.
     */
    public void clearCachedAuthorizationInfo(String principal) {
        SimplePrincipalCollection principals = new SimplePrincipalCollection(principal, getName());
        clearCachedAuthorizationInfo(principals);
    }

    /**
     * 清除所有用户授权信息缓存.
     */
    public void clearAllCachedAuthorizationInfo() {
        Cache<Object, AuthorizationInfo> cache = getAuthorizationCache();
        if (cache != null) {
            for (Object key : cache.keys()) {
                cache.remove(key);
            }
        }
    }

    public static UserGeneralInfo getSessionUser() {

        Subject subject = SecurityUtils.getSubject();

        if (subject != null && subject.getPrincipal() != null && subject.getPrincipal() instanceof UserGeneralInfo) {
            return (UserGeneralInfo) subject.getPrincipal();
        }

        return null;
    }


}