package com.LoginFilter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class Payment
 */
public class Payment implements Filter {
	public void destroy() {
		// TODO Auto-generated method stub
	}
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
		System.out.println("--------------- get payment ------------------");
		System.out.println(servletRequest.getRemoteHost());
		
//		String bankOrigin="127.0.0.1";
//		String requestOrigin=servletRequest.getRemoteHost();
//		if(bankOrigin.equals(requestOrigin)){
//			chain.doFilter(servletRequest, servletResponse);
//		}else{
//			System.out.println("----- Requester is not ABA Bank -----");
//			return;
//		}	 	
		chain.doFilter(servletRequest, servletResponse);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
