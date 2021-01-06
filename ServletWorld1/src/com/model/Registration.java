package com.model;

import java.sql.Connection;

import com.dataAcces.DBConnection;
import com.dataAcces.UsersTable;
import com.dto.UserDetails;

public class Registration {
	public boolean  register(UserDetails userDetail) throws Exception
 	{
	 DBConnection db=new DBConnection();
	 Connection conn= db.getDBConnection("");
	 UsersTable usertable=new UsersTable();
	 boolean result=usertable.insertUser(userDetail,conn);
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
