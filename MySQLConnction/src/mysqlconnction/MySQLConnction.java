/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysqlconnction;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Administrator
 */
public class MySQLConnction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        try{
            String url = "jdbc:mysql://localhost:3306/mydatabase";
            String username = "root";
            String password="root";
           Connection con=DriverManager.getConnection(url,username,password);
//"jdbc:mysql://localhost:3306/mydatabase","root","root");  */
            
            Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from addressbook");  
while(rs.next())  
System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
con.close(); 
            
        }catch(Exception e)
        {
            System.out.println(e);
        
    }
    
}
}

