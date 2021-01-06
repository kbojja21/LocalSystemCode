package com.model;

import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.sql.Connection;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.dataAccesLayer.DBConnection;
import com.dataAccesLayer.UsersTable;
import com.hibernate.LoginHelper;

public class AjaxModel {
//	public boolean authenticate(String email) throws Exception
//	{
//		 DBConnection db=new DBConnection();
//		 Connection conn= db.getDBConnection("");
//		 UsersTable usertable=new UsersTable();
//		 boolean result=usertable.validateAjax(email, conn);
//		if(result)
//			return true;
//		else
//			return false;
//	}
public String signupEmail;
	
	public String getSignupEmail() {
		return signupEmail;
	}

	public void setSignupEmail(String signupEmail) {
		this.signupEmail = signupEmail;
	}

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
	public String emailCheck()
	{
		//log.info("successful entry in register method from class Registration");
		boolean result=loginHelper.emailCheck(sessionFactory,signupEmail);
				if(result){
					inputStream=new StringBufferInputStream("yes");
					return "success";
				}
				else
					inputStream=new StringBufferInputStream("no");
					return "success";
					
	}
}
