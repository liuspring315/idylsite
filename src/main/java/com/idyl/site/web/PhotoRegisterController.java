package com.idyl.site.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by spring on 15-3-16.
 */
@Controller
@RequestMapping("photoer")
public class PhotoRegisterController {
    @RequestMapping("register")
    public String index(Model model){
        return "photoer/photoer_register";
    }
}
