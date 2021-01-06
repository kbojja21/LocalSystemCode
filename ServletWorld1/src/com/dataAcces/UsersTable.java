package com.dataAcces;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dto.UserDetails;

public class UsersTable  {

	

	public static boolean insertUser(UserDetails userDetail,Connection conn) throws  SQLException
    {
		String name=userDetail.getName();
		String email=userDetail.getEmail();
		String password=userDetail.getPassword();
		String gender=userDetail.getGender();
		String date=userDetail.getDate();
		String security=userDetail.getSecurity();
		String secAnswer=userDetail.getSecurityanswer();
        PreparedStatement stmt = null;
        try
        {
            stmt = conn.prepareStatement("insert into customer_login values (?,?,?,?,?,?,? )");
            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setString(3, password);
            stmt.setString(4, gender);
            stmt.setString(5, date);
            stmt.setString(6, security);
            stmt.setString(7, secAnswer);
            int recordImpacted=stmt.executeUpdate();
          boolean result= validateAjax(email,conn);
          if(result)
        	  return true;
          else 
        	  return false;
           // System.out.println("total inserts:"+recordImpacted);
        }
        catch (SQLException e)
        {
        	e.printStackTrace();
        	throw e;
        }
        finally
        {
            try{
            	stmt.close();} catch(SQLException s){}
        }
    }

	
	//updateOrder("john","new_pasword")
	public static void updatePwd(String uid,String pwd, Connection conn) throws  SQLException
    {
        PreparedStatement stmt = null;
        try
        {
            stmt = conn.prepareStatement("update customer set password=? where userid=?");
            stmt.setString(1, pwd);
            stmt.setString(2, uid);
            stmt.executeUpdate();
        }
        catch (SQLException e)
        {
        	e.printStackTrace();
        	throw e;
        }
        finally
        {
            try{
            	stmt.close();} catch(SQLException s){}
        }
     
    }
	

	public static void deleteUser(String delUid,Connection conn) throws  SQLException
    {
        PreparedStatement stmt = null;
        try
        {
            stmt = conn.prepareStatement("delete from customer where userid=?");
            stmt.setString(1, delUid);
            int rowsupdated=stmt.executeUpdate();
        }
        catch (SQLException e)
        {
        	e.printStackTrace();
        	throw e;
        }
        finally
        {
            try{
            	stmt.close();} catch(SQLException s){}
        }
     
    }

	public static String getEmail4Userid(String userid,Connection conn) throws SQLException 
    {
		//date="03/20/15"
        PreparedStatement stmt = null;
        ResultSet resultSet = null;
        String result=null;
        try
        {
        	stmt = conn.prepareStatement("select email from customer where userid=?");
            stmt.setString(1, userid);
            resultSet = stmt.executeQuery();
            
            while (resultSet.next())
            {
            	result=resultSet.getString("email");
            }
            
        }
        catch (SQLException e)
        {
        	System.out.println("Exception occured");
        	e.printStackTrace();
            throw e;
        }
        finally
        {
        	try{
        		resultSet.close(); } catch(SQLException s){}
            try{
            	stmt.close();} catch(SQLException s){}
        }
        
        return result;
    }



	public static boolean validateLogin(String email,String password,Connection conn) throws SQLException 
    {
		//date="03/20/15"
        PreparedStatement stmt = null;
        ResultSet resultSet = null;
        boolean result=false;
        try
        {
        	stmt = conn.prepareStatement("select name from customer_login where email=? and password=?");
        	stmt.setString(1, email);
        	stmt.setString(2, password);
            resultSet = stmt.executeQuery();
            if(resultSet.next())
            	return true;
            else
            	return false;
        }
        catch (SQLException e)
        {
        	System.out.println("Exception occured");
        	e.printStackTrace();
            throw e;
        }
        finally
        {
        	try{
        		resultSet.close(); } catch(SQLException s){}
            try{
            	stmt.close();} catch(SQLException s){}
        }
        
    }
	public static boolean validateAjax(String email,Connection conn) throws SQLException 
    {
		//date="03/20/15"
        PreparedStatement stmt = null;
        ResultSet resultSet = null;
        boolean result=false;
        try
        {
        	stmt = conn.prepareStatement("select name from customer_login where email=?");
        	stmt.setString(1, email);
        	//stmt.setString(2, password);
            resultSet = stmt.executeQuery();
            if(resultSet.next())
            	return true;
            else
            	return false;
        }
        catch (SQLException e)
        {
        	System.out.println("Exception occured");
        	e.printStackTrace();
            throw e;
        }
        finally
        {
        	try{
        		resultSet.close(); } catch(SQLException s){}
            try{
            	stmt.close();} catch(SQLException s){}
        }
        
    }
	
	public static String validateAjaxSecurity(String email,Connection conn) throws SQLException 
    {
		//date="03/20/15"
        PreparedStatement stmt = null;
        ResultSet resultSet = null;
        
        String security = null;
        try
        {
        	stmt = conn.prepareStatement("select securityquestion from customer_login where email=?");
        	stmt.setString(1,email);
        	//stmt.setString(2, password);
            resultSet = stmt.executeQuery();
            
            while(resultSet.next()){
            	 security = resultSet.getString("securityquestion");
            	System.out.println("result check ="+security);
            }
            
        }
        catch (SQLException e)
        {
        	System.out.println("Exception occured");
        	e.printStackTrace();
            throw e;
        }
        finally
        {
        	try{
        		resultSet.close(); } catch(SQLException s){}
            try{
            	stmt.close();} catch(SQLException s){}
        }
        return security;
    }
}
