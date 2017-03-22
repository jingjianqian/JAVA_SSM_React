package com.joker.test;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class helloWorldServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response){
		System.out.println("Hello world Servlet");
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response){
		this.doGet(request,response);
	}
}
