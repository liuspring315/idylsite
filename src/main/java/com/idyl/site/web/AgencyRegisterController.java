package com.idyl.site.web;

import com.idyl.site.data.UserGeneralInfo;
import com.idyl.site.service.AgencyRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by spring on 15-3-19.
 */
@Controller
@RequestMapping("agency")
public class AgencyRegisterController {
	@Autowired
	private AgencyRegisterService agencyRegisterService;

	@RequestMapping("register")
	public String index(Model model){
		return "agency/agency_register";
	}

	@RequestMapping(value="register",method = RequestMethod.POST)
	public String register(Model model,@Valid UserGeneralInfo userGeneralInfo,BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			return "agency/agency_register";
		}
		agencyRegisterService.saveUser(userGeneralInfo);
		return "agency/agency_register_success";
	}
}