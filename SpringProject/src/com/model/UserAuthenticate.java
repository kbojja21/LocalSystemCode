package com.model;

import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.sql.Connection;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;


import com.hibernate.LoginHelper;

public class UserAuthenticate {
	static Logger log=Logger.getLogger("spring");
	public String uname1;
	public String password1;
	
 public String getUname1() {
		return uname1;
	}

	public void setUname1(String uname1) {
		this.uname1 = uname1;
	}

	public String getPassword1() {
		return password1;
	}

	public void setPassword1(String password1) {
		this.password1 = password1;
	}

//public String validate() throws Exception
// 	{
//	// log.debug("entered validate method in class UserAuthenticate ");
//	 DBConnection db=new DBConnection();
//	 Connection conn= db.getDBConnection(uname1);
//	 UsersTable usertable=new UsersTable();
//	 boolean result=usertable.validateLogin(uname1, password1, conn);
//	 if(result)
//		 return "success";
//	 else 
//		 return "failure";
//	 
////	 	if(name.equalsIgnoreCase("java")&&password.equalsIgnoreCase("j2ee"))
////	 		return true;
////	 	else
////	 		return false;
// 	}
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
	public String validate()
	{
		log.info("successful entry in validate method from class UserAuthenticate");
		boolean result=loginHelper.validate(sessionFactory, uname1, password1);
				if(result)
					{inputStream=new StringBufferInputStream("yes");
				    return "success";
					}
				else
				{
					inputStream=new StringBufferInputStream("no");
				return "success";
				}
				
					
	}
}
