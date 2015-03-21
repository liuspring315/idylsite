package com.idyl.site.web;

import com.idyl.site.data.UserGeneralInfo;
import com.idyl.site.service.PhotoRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by spring on 15-3-16.
 */
@Controller
@RequestMapping("photoer")
public class PhotoRegisterController {
	@Autowired
	private PhotoRegisterService photoRegisterService;

    @RequestMapping("register")
    public String index(Model model){
        return "photoer/photoer_register";
    }

	@RequestMapping(value="register",method = RequestMethod.POST)
	public String register(Model model,@Valid UserGeneralInfo userGeneralInfo,BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			return "photoer/photoer_register";
		}
		photoRegisterService.saveUser(userGeneralInfo);
		return "photoer/photoer_register_success";
	}
}
