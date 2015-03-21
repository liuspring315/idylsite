package com.idyl.site.service.account;

import com.idyl.site.data.UserGeneralInfo;

/**
 *
 * 作成日期： 2012-8-16 
 * <p>功能描述:安全相关实体的管理类,包括用户和权限组</p>
 * @author  liuzhaocun
 * @version 0.1
 */

public interface  AccountService {


	public UserGeneralInfo findByLoginName(String loginName,String password) ;


}
