package com.model;

import java.io.InputStream;
import java.io.StringBufferInputStream;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.hibernate.LoginHelper;

public class NewPasswordUpdate {
	public String recoveryName;
	public String recoveryQuestion;
	public String recoverysecurityanswer;
	public String newPassword1;
	public String getRecoveryName() {
		return recoveryName;
	}
	public void setRecoveryName(String recoveryName) {
		this.recoveryName = recoveryName;
	}
	public String getRecoveryQuestion() {
		return recoveryQuestion;
	}
	public void setRecoveryQuestion(String recoveryQuestion) {
		this.recoveryQuestion = recoveryQuestion;
	}
	public String getRecoverysecurityanswer() {
		return recoverysecurityanswer;
	}
	public void setRecoverysecurityanswer(String recoverysecurityanswer) {
		this.recoverysecurityanswer = recoverysecurityanswer;
	}
	public String getNewPassword1() {
		return newPassword1;
	}
	public void setNewPassword1(String newPassword1) {
		this.newPassword1 = newPassword1;
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
//	private InputStream inputStream;
//	public InputStream getInputStream(){
//		return inputStream;
//	}
	public String newPasswordInsert()
	{
		//log.info("successful entry in register method from class Registration");
		int result=loginHelper.passwordInsert(sessionFactory,recoveryName,newPassword1);
				if(result==1){
					//inputStream=new StringBufferInputStream("yes");
					return "success";
				}
				else
					//inputStream=new StringBufferInputStream("no");
					return "failure";
					
	}
}
