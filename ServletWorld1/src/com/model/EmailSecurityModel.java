package com.model;

import java.sql.Connection;

import com.dataAcces.DBConnection;
import com.dataAcces.UsersTable;

public class EmailSecurityModel {
	public String validateAjaxSecurity(String email) throws Exception
	{
		 DBConnection db=new DBConnection();
		 Connection conn= db.getDBConnection("");
		 UsersTable usertable=new UsersTable();
		 String result=null;
		 result=usertable.validateAjaxSecurity(email, conn);
		 System.out.println("result check ="+result);
			return result;
		
	}
}
