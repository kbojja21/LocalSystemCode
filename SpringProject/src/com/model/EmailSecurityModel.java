package com.model;

import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.sql.Connection;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.dataAccesLayer.DBConnection;
import com.dataAccesLayer.UsersTable;
import com.hibernate.LoginHelper;

public class EmailSecurityModel {
	
	
	public String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

//	public String validateAjaxSecurity(String email) throws Exception
//	{
//		 DBConnection db=new DBConnection();
//		 Connection conn= db.getDBConnection("");
//		 UsersTable usertable=new UsersTable();
//		 String result=null;
//		 result=usertable.validateAjaxSecurity(email, conn);
//		 System.out.println("result check ="+result);
//			return result;
//		
//	}
	@Autowired
	LoginHelper loginHelper;
	
	public LoginHelper getLoginHelper() {
		return loginHelper;
	}

	public void setLoginHelper(LoginHelper loginHelper) {
		this.loginHelper = loginHelper;
	}
	@Autowired
	SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	private InputStream inputStream;
	public InputStream getInputStream(){
		return inputStream;
	}
	public String emailSecurity()
	{
		//log.info("successful entry in register method from class Registration");
		String result=loginHelper.emailSecurity(sessionFactory,email);
				if(result!=null){
					inputStream=new StringBufferInputStream(result);
					return "success";
				}
				else
					inputStream=new StringBufferInputStream("");
					return "success";
					
	}

}
