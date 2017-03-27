package com.joker.test;

import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionEvent;

public class MyHttpSessionListener implements HttpSessionListener{	
	public void sessionCreated(HttpSessionEvent hsle){
		System.out.println("sessionCreated!!");
	}
	
	public void sessionDestroyed(HttpSessionEvent hsle){
		System.out.println("sessionDestroyed");
	}
}
