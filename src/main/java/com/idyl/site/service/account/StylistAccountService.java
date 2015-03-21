package com.idyl.site.service.account;

import com.idyl.site.dao.account.UserDao;
import com.idyl.site.data.*;
import com.idyl.site.util.MD5Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

/**
 *
 * 作成日期： 2012-8-16 
 * <p>功能描述:安全相关实体的管理类,包括用户和权限组</p>
 * @author  liuzhaocun
 * @version 0.1
 */
//Spring Bean的标识.
@Component("stylistAccountService")
//默认将类中的所有public函数纳入事务管理.
@Transactional(readOnly = true)
public class   StylistAccountService implements AccountService{
    @Autowired
    protected UserDao userDao;


	public UserGeneralInfo findByLoginName(String loginName,String password) {
		String[] arrStr = loginName.split(",");
		StylistExtra stylistExtra = userDao.findStylistExtraExtraByLoginName(arrStr[1], MD5Builder.getMD5(password));
		return stylistExtra;
	}


}
