package com.idyl.site.web;

import com.idyl.site.data.UserGeneralInfo;
import com.idyl.site.service.UserRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

/**
 * Created by spring on 15-3-17.
 */
@Controller
@RequestMapping("user")
public class UserRegisterController {


	@Autowired
	private UserRegisterService userRegisterService;

	@RequestMapping(value="register",method = RequestMethod.GET)
	public String index(@ModelAttribute UserGeneralInfo userGeneralInfo){
		return "user/user_register";
	}
	@RequestMapping(value="register",method = RequestMethod.POST)
	public String register(Model model,@Valid @ModelAttribute UserGeneralInfo userGeneralInfo,BindingResult bindingResult,RedirectAttributes redirectAttributes){
		if(bindingResult.hasErrors()){
			return "user/user_register";
		}
		String message = userRegisterService.saveUser(userGeneralInfo);
		redirectAttributes.addFlashAttribute("message",message);
		return "redirect:/user/user_register_success";
	}

	@RequestMapping(value="user_register_success",method = RequestMethod.GET)
	public String user_register_success(){
		return "user/user_register_success";
	}
}