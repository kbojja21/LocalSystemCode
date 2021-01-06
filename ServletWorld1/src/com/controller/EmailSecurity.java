package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.UserDetails;
import com.model.EmailSecurityModel;
import com.model.Registration;

public class EmailSecurity extends HttpServlet {
	public  void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		EmailSecurityModel security=new EmailSecurityModel();
		String email=req.getParameter("email");
		String result=null;
		try {
			  result=security.validateAjaxSecurity(email);
			  res.setContentType("text/html");
				PrintWriter email1 = res.getWriter();
				System.out.println("result check ="+result);
				email1.print(result);
				email1.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		//String ajaxResponse=null;
		
//		try {
//			email1 = res.getWriter();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	
  }
	public  void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		doGet(req,res);
	}
}
