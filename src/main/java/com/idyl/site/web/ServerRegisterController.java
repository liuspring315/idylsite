package com.idyl.site.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
