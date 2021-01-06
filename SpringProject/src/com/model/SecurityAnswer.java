package com.model;

import java.io.InputStream;
import java.io.StringBufferInputStream;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.hibernate.LoginHelper;

public class SecurityAnswer {
	public String email;
	public String answer;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
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
	public String answerCheck()
	{
		//log.info("successful entry in register method from class Registration");
		boolean result=loginHelper.answerCheck(sessionFactory,email,answer);
				if(result){
					inputStream=new StringBufferInputStream("yes");
					return "success";
				}
				else
					inputStream=new StringBufferInputStream("no");
					return "success";
					
	}
}
