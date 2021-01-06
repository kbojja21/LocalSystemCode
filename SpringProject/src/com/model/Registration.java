package com.model;

import java.sql.Connection;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.hibernate.LoginHelper;
import org.apache.log4j.Logger;

public class Registration {
	
	public String signupName;
	public String signupEmail;
	public String signupNewPassword;
	public String signupNewPassword1;
	public String gender;
	public String date;
	public String security;
	public String signupsecurityanswer;
	
	public String getSignupName() {
		return signupName;
	}
	public void setSignupName(String signupName) {
		this.signupName = signupName;
	}
	public String getSignupEmail() {
		return signupEmail;
	}
	public void setSignupEmail(String signupEmail) {
		this.signupEmail = signupEmail;
	}
	public String getSignupNewPassword() {
		return signupNewPassword;
	}
	public void setSignupNewPassword(String signupNewPassword) {
		this.signupNewPassword = signupNewPassword;
	}
	public String getSignupNewPassword1() {
		return signupNewPassword1;
	}
	public void setSignupNewPassword1(String signupNewPassword1) {
		this.signupNewPassword1 = signupNewPassword1;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getSecurity() {
		return security;
	}
	public void setSecurity(String security) {
		this.security = security;
	}
	public String getSignupsecurityanswer() {
		return signupsecurityanswer;
	}
	public void setSignupsecurityanswer(String signupsecurityanswer) {
		this.signupsecurityanswer = signupsecurityanswer;
	}
	
	
//	public boolean  register(UserDetails userDetail) throws Exception
// 	{
//	 DBConnection db=new DBConnection();
//	 Connection conn= db.getDBConnection("");
//	 UsersTable usertable=new UsersTable();
//	 boolean result=usertable.insertUser(userDetail,conn);
//	 if(result)
//		 return true;
//     else 
//    	 return false;
//	 
//	 	if(name.equalsIgnoreCase("java")&&password.equalsIgnoreCase("j2ee"))
//	 		return true;
//	 	else
//	 		return false;
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
	
//
//	@Autowired
//	Registration register;
//	
//	public Registration getRegister() {
//		return register;
//	}
//	public void setRegister(Registration register) {
//		this.register = register;
//	}
	public String register()
	{
		//log.info("successful entry in register method from class Registration");
		int result=loginHelper.insertUser(sessionFactory,signupName,signupEmail,signupNewPassword ,gender,date,security,signupsecurityanswer);
				if(result==1)
					return "success";
				else
					return "failure";
					
	}
}
