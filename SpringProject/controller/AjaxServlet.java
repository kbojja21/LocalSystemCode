package com.controller;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.AjaxModel;

public class AjaxServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)
	{
		try
		{
			AjaxModel ajax=new AjaxModel();
			String email=req.getParameter("signupEmail");
			boolean result=ajax.authenticate(email);
			String jsonResponse="";
			if(result)
				{
					jsonResponse="{\n"+ 
									"\"isEmailExist\":\"true\"" +
									"\n}";
				}
			else
			{
				jsonResponse="{\n"+ 
						"\"isEmailExist\":\"false\"" +
						"\n}";
			}
			res.setContentType("application/json");
			PrintWriter email1=res.getWriter();
			email1.print(jsonResponse);
			email1.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res)
	{
		doGet(req,res);
	}
}

