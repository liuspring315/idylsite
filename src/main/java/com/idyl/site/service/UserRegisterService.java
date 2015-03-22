package com.idyl.site.service;

import com.idyl.site.dao.RegisterDAO;
import com.idyl.site.data.UserGeneralInfo;
import com.idyl.site.data.UserTypeEnum;
import com.idyl.site.util.MD5Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by spring on 15-3-19.
 */
//Spring Bean的标识.
@Component
//默认将类中的所有public函数纳入事务管理.
@Transactional(readOnly = true)
public class UserRegisterService {

	@Autowired
	private RegisterDAO registerDAO;

	@Transactional(readOnly = false)
	public void saveUser(UserGeneralInfo userGeneralInfo){
		userGeneralInfo.setUserType(UserTypeEnum.CUSTOMER.getCode());
		userGeneralInfo.setPassword(MD5Builder.getMD5(userGeneralInfo.getPassword()));
		registerDAO.insertGeneralInfo(userGeneralInfo);

	}
}
