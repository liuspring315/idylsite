package com.idyl.site.web;

import com.idyl.site.data.UserGeneralInfo;
import com.idyl.site.data.UserTypeEnum;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by spring on 15-3-4.
 */
@Controller
public class MainController extends  BaseController{


    @RequestMapping("main")
    public String index(HttpServletRequest request){
	    UserGeneralInfo user = super.getCurrUser(request);
	    if(user.getUserType()== UserTypeEnum.CUSTOMER.getCode()) {
		    return "main";
	    }else if(user.getUserType()== UserTypeEnum.PHOTOGRAPHER.getCode()) {
		    return "main";
	    }else if(user.getUserType()== UserTypeEnum.STYLIST.getCode()) {
		    return "main";
	    }else if(user.getUserType()== UserTypeEnum.AGENCY.getCode()) {
		    return "main";
	    }else {
		    return "main";
	    }

    }
}
