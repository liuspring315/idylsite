package com.idyl.site.web;

import com.idyl.site.data.UserGeneralInfo;
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
@RequestMapping("server")
public class ServerRegisterController {

    @RequestMapping("register")
    public String index(Model model){
        return "server/server_register";
    }

}
