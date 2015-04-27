package com.idyl.site.web.manager.photographer;

import com.idyl.site.web.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by spring on 15-4-27.
 */
@Controller
@RequestMapping("manager/photographer/")
public class PhotographerGoodsController  extends BaseController {

	@RequestMapping("goods")
	public String index(HttpServletRequest request){
		return "manager/photographer/photographer_goods";

	}
}
