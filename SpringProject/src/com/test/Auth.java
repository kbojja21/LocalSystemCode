package com.test;

import java.util.HashMap;
import java.util.Map;

import com.model.UserAuthenticate;

public class Auth extends ParentTestClass{
	
	public Auth() throws Exception
	{
		super("test");
	}
	
//	public void testMissingUserid() throws Exception {
//		  UserAuthenticate action = (UserAuthenticate)(createAction(UserAuthenticate.class,"/login", "FirstLoginServlet"));
//		  Map<String, Object> params = new HashMap<String, Object>();
//			params.put("password1", "kittu");
//			proxy.getInvocation().getInvocationContext().setParameters(params);
//			String result = proxy.execute();
//		  assertEquals(result, "input");
//		 }
//	public void testMissingPassword() throws Exception {
//		  UserAuthenticate action = (UserAuthenticate)(createAction(UserAuthenticate.class,"/login", "FirstLoginServlet"));
//		  Map<String, Object> params = new HashMap<String, Object>();
//			params.put("uname1", "kittu@gmail.com");
//			proxy.getInvocation().getInvocationContext().setParameters(params);
//			String result = proxy.execute();
//		  assertEquals(result, "input");
//		 }
	public void testInvalidLogin() throws Exception {
		  UserAuthenticate action = (UserAuthenticate)(createAction(UserAuthenticate.class,"/login", "FirstLoginServlet"));
		  Map<String, Object> params = new HashMap<String, Object>();
			params.put("uname1", "kittu@gmail.com");
			params.put("password1", "kittu1");
			proxy.getInvocation().getInvocationContext().setParameters(params);
			
		  String result = proxy.execute();
		  assertEquals(result, "failure");
		 }
	public void testValidLogin() throws Exception {
		  	createAction(UserAuthenticate.class,"/login", "FirstLoginServlet");
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("uname1", "kittu@gmail.com");
			params.put("password1", "kittu");
			proxy.getInvocation().getInvocationContext().setParameters(params);
			String result = proxy.execute();
			assertEquals(result, "success");
		 }
	 
}
