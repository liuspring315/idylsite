package com.idyl.site.service;

import com.idyl.site.dao.RegisterDAO;
import com.idyl.site.data.UserGeneralInfo;
import com.idyl.site.data.UserTypeEnum;
import com.idyl.site.util.MD5Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

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
	public String saveUser(UserGeneralInfo userGeneralInfo){
		Map<String,Object> existUser = registerDAO.findByLoginName(userGeneralInfo.getUserName(), userGeneralInfo.getEmail());
		if(existUser != null){
			if(existUser.get("USER_NAME").equals(userGeneralInfo.getUserName())){
				return "用户名已存在";
			}else{
				return "电子邮箱已存在";
			}
		}
		userGeneralInfo.setUserType(UserTypeEnum.CUSTOMER.getCode());
		userGeneralInfo.setPassword(MD5Builder.getMD5(userGeneralInfo.getPassword()));
		registerDAO.insertGeneralInfo(userGeneralInfo);
		return "感谢您注册成功：）";

	}
}
