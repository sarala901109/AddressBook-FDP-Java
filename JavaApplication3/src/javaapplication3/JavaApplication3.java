/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.sql.*;

/**
 *
 * @author Administrator
 */

public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  
    {
        // TODO code application logic here
        Connection con;
        try{
               //Connection con=null;
               con = DriverManager.getConnection  
               ("jdbc:oracle:thin:@172.16.0.70:1521:cas","fdp18","fdp18");
               if (con != null) { 
                   //System.out.println ("Connected with oracle");
                   Statement stmt=con.createStatement();
                   ResultSet rs=stmt.executeQuery("select * from addressbook");  
                   while(rs.next())  
                      System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
  //step5 close the connection object  
                   con.close();  
               }
                            
            } catch(SQLException e) { System.out.println(e); }
      }
}