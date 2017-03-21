package com.joker.test;

import java.servlet.http.HttpServlet;
import java.servlet.http.HttpServletRequest;
import java.servlet.http.HttpServletResponse;

public class helloWorldServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response){
		System.out.println("Hello world Servlet");
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response){
		doGet();
	}
}
