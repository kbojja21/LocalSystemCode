package com.dataAccesLayer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Connection;
public class TestDBCalls {
	public static void main(String args[]) throws Exception
	{
		
		Connection conn=DBConnection.getDBConnection("mySql");
		try{
		conn.setAutoCommit(false);
	
		conn.commit();
		}catch(Exception e)
		{
			e.printStackTrace();
			conn.rollback();
		}
		finally{
			try{
				conn.close();
			}catch(Exception e){}
		}
	}

}
