package com.idyl.site.web;

import com.idyl.site.data.UserGeneralInfo;
import com.idyl.site.service.StylistRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by spring on 15-3-17.
 */
@Controller
@RequestMapping("stylist")
public class StylistRegisterController {
	@Autowired
	private StylistRegisterService stylistRegisterService;

	@RequestMapping("register")
	public String index(Model model){
		return "stylist/stylist_register";
	}

	@RequestMapping(value="register",method = RequestMethod.POST)
	public String register(Model model,@Valid UserGeneralInfo userGeneralInfo,BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			return "stylist/stylist_register";
		}
		stylistRegisterService.saveUser(userGeneralInfo);
		return "stylist/stylist_register_success";
	}
}