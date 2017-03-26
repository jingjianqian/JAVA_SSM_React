package com.joker.test;

import javax.servlet.ServletContextListener;
import javax.servlet.ServletContextEvent;
public class ListenerInit implements ServletContextListener{
	
	public void contextInitialized(ServletContextEvent event){
		System.out.println("listener is inited!");
	}
	public void contextDestroyed(ServletContextEvent event){
		System.out.println("Listener is destroied");
	}
}
