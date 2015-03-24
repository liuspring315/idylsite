package com.idyl.site.web.manager.photographer;

import com.idyl.site.web.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by spring on 15-3-24.
 */
@Controller
@RequestMapping("manager/photographer/")
public class PhotographerMainController extends BaseController {

	@RequestMapping("main")
	public String index(HttpServletRequest request){
		return "manager/photographer/photographer_main";

	}
}
