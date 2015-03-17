package com.idyl.site.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by spring on 15-3-17.
 */
@Controller
@RequestMapping("user")
public class UserRegisterController {
	@RequestMapping("register")
	public String index(Model model){
		return "user/user_register";
	}
}