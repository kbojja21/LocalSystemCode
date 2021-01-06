package com.model;

import java.sql.Connection;


import com.dataAcces.DBConnection;
import com.dataAcces.UsersTable;

public class UserAuthenticate {
	
 public boolean validate(String name,String password) throws Exception
 	{
	 DBConnection db=new DBConnection();
	 Connection conn= db.getDBConnection(name);
	 UsersTable usertable=new UsersTable();
	 boolean result=usertable.validateLogin(name, password, conn);
	 if(result)
		 return true;
	 else 
		 return false;
	 
//	 	if(name.equalsIgnoreCase("java")&&password.equalsIgnoreCase("j2ee"))
//	 		return true;
//	 	else
//	 		return false;
 	}
}
