package com.idyl.site.web.listener;

import com.idyl.site.data.UserGeneralInfo;
import com.idyl.site.data.UserTypeEnum;
import com.idyl.site.service.account.ShiroDbRealmService;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**     
 * Created on 12-10-16
 *
 * @version 0.1
 * @liuzhaochun
 */
public class LoginFilter implements Filter  {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest hRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse hResponse = (HttpServletResponse) servletResponse;

	    UserGeneralInfo user = ShiroDbRealmService.getSessionUser();
	    if(hRequest.getRequestURI().indexOf("manager/photographer/")>0){
		    if(user.getUserType() != UserTypeEnum.PHOTOGRAPHER.getCode()) {
			    hResponse.sendRedirect(hRequest.getContextPath()+ "/login");
                return;
		    }
	    }
	    if(hRequest.getRequestURI().indexOf("manager/stylist/")>0){
		    if(user.getUserType() != UserTypeEnum.STYLIST.getCode()) {
			    hResponse.sendRedirect(hRequest.getContextPath()+ "/login");
			    return;
		    }
	    }
	    if(hRequest.getRequestURI().indexOf("manager/agency/")>0){
		    if(user.getUserType() != UserTypeEnum.AGENCY.getCode()) {
			    hResponse.sendRedirect(hRequest.getContextPath()+ "/login");
			    return;
		    }
	    }

        filterChain.doFilter(hRequest, hResponse);
    }

    @Override
    public void destroy() {

    }
}
