package com.idyl.site.web.manager.photographer;

import com.idyl.site.data.PhotoOrder;
import com.idyl.site.data.UserGeneralInfo;
import com.idyl.site.service.OrderService;
import com.idyl.site.service.UserRegisterService;
import com.idyl.site.web.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by spring on 15-4-27.
 */
@Controller
@RequestMapping("manager/photographer/")
public class PhotographerOrderController extends BaseController {

	@Autowired
	private OrderService orderService;

	@RequestMapping("order")
	public String index(HttpServletRequest request, Model model){

		UserGeneralInfo userInfo = this.getCurrUser(request);
		List<PhotoOrder> orders = orderService.getOrderListByPhotographerId(userInfo.getId());
		model.addAttribute("orderList", orders);
		return "manager/photographer/photographer_order";

	}

	@RequestMapping("order_confirm")
	public String confirmOrder(HttpServletRequest request, int orderId, Model model){
		UserGeneralInfo userInfo = this.getCurrUser(request);
		orderService.confirmOrder(userInfo.getId(), orderId);
		model.addAttribute("orderId", orderId);
		return "";
	}
	@RequestMapping("order_search")
	public String searchOrder(HttpServletRequest request, String desc, Model model){
		UserGeneralInfo userInfo = this.getCurrUser(request);
		orderService.searchOrder(userInfo.getId(), desc);
		model.addAttribute("orderList", orderService.searchOrder(userInfo.getId(),  desc));
		return "manager/photographer/photographer_order";
	}

}

