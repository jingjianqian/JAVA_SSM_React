package com.joker.test;

import javax.servlet.ServletContextListener;
import javax.servlet.ServletContextEvent;
public class MyServletContext implements ServletContextListener{

	public void contextInitialized(ServletContextEvent sce){
		String param1 = sce.getServletContext().getInitParameter("initParam1");
		System.out.println("ServletContextInitialized!! getParam1:"+param1);
	}
	public void contextDestroyed(ServletContextEvent sce){
		String param1 = sce.getServletContext().getInitParameter("initParam1");
		System.out.println("ServletContextDestroyed!! getParam1:"+ param1);
	}
}
