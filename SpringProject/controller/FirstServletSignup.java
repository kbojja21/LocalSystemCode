package com.controller;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.UserDetails;
import com.model.Registration;
import com.model.UserAuthenticate;

public class FirstServletSignup extends HttpServlet {
	public  void doGet(HttpServletRequest req,HttpServletResponse res)
	{
		String name=req.getParameter("signupName");
		String email=req.getParameter("signupEmail");
		String password=req.getParameter("signupNewPassword");
		//String password1=req.getParameter("signupNewPassword1");
		String gender=req.getParameter("gender");
		String date=req.getParameter("date");
		String security=req.getParameter("security");
		String securityanswer=req.getParameter("signupsecurityanswer");
		Registration reg=new Registration();  
		UserDetails userDetail=new UserDetails();
		userDetail.setName(name);
		userDetail.setEmail(email);
		userDetail.setPassword(password);
		userDetail.setDate(date);
		userDetail.setGender(gender);
		userDetail.setSecurity(security);
		userDetail.setSecurityanswer(securityanswer);
		boolean result = false;
		try {
			 result=reg.register(userDetail);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
//		boolean result = false;
//		try {
//			result = reg.register(userDetail );
//		} catch (Exception e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
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
