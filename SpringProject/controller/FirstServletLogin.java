package com.controller;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.UserAuthenticate;

public class FirstServletLogin extends HttpServlet 
{
	public  void doGet(HttpServletRequest req,HttpServletResponse res)
	{
		String uname=req.getParameter("uname1");
		String password=req.getParameter("password1");
		UserAuthenticate user=new UserAuthenticate();  
		boolean result = false;
		try {
			result = user.validate(uname,password);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
		if(result)	
				res.sendRedirect("welcome.html");	
		else
			res.sendRedirect("index.html");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public  void doPost(HttpServletRequest req,HttpServletResponse res)
	{
		doGet(req,res);
	}
}
