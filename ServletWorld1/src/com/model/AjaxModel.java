package com.model;

import java.sql.Connection;

import com.dataAcces.DBConnection;
import com.dataAcces.UsersTable;

public class AjaxModel {
	public boolean authenticate(String email) throws Exception
	{
		 DBConnection db=new DBConnection();
		 Connection conn= db.getDBConnection("");
		 UsersTable usertable=new UsersTable();
		 boolean result=usertable.validateAjax(email, conn);
		if(result)
			return true;
		else
			return false;
	}
}
