/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.csueb.cs3520.util;
import java.sql.*;

/**
 *
 * @author Simi510
 */
public class AuthUtils {


    public static boolean authenticate(String username, String password){
                    ResultSet rs =null;
            PreparedStatement ps = null;
            Connection con = null;
        boolean status = false;
        

        
        try{

	 //loading drivers for mysql
         Class.forName("com.mysql.jdbc.Driver");

 	 //creating connection with the database 
          con=DriverManager.getConnection
                        ("jdbc:mysql://localhost:3306/cs3520","root","simi");
          ps =con.prepareStatement
                             ("select * from User where username=? and password=?");
         ps.setString(1, username);
         ps.setString(2, password);
          rs =ps.executeQuery();
         status = rs.next();
        
      }catch(Exception e)
      {
          e.printStackTrace();
      }finally{
            try{
                rs.close();
                ps.close();
                con.close();
            }catch(Exception e){
            
             }
        }
            /*
        //implement credential check
        if(username.equals("simi") || username.equals("admin") || username.equals("Singh")){
            status = true;
        }
*/
        return status;

    }
    
    
        public static boolean isAdmin(String username, String password){
        ResultSet rs =null;
        PreparedStatement ps = null;
        Connection con = null;
        boolean status = false;
        

        
        try{

	 //loading drivers for mysql
         Class.forName("com.mysql.jdbc.Driver");

 	 //creating connection with the database 
          con=DriverManager.getConnection
                        ("jdbc:mysql://localhost:3306/cs3520","root","simi");
          ps =con.prepareStatement
                             ("select * from User where username=? and password=? and role_id=?");
         ps.setString(1, username);
         ps.setString(2, password);
         ps.setString(3, "1");
         rs =ps.executeQuery();
         status = rs.next();
        
      }catch(Exception e)
      {
          e.printStackTrace();
      }finally{
            try{
                rs.close();
                ps.close();
                con.close();
            }catch(Exception e){
            
             }
        }
      return status;
    }
}
        
