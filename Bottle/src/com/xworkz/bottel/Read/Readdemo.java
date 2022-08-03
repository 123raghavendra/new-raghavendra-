package com.xworkz.bottel.Read;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;



public class Readdemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/perfume1","root","2ka17cv405@94");
	  
		String sql="select com .* from perfume1.company_info as com where Brand ='villan'";
		Statement statement=connection.createStatement();
		
    ResultSet resultset = statement.executeQuery(sql);
    
    boolean result=resultset.next();
    
    System.out.println(result);
      if(result) { 
    int u =resultset.getInt("id");
    System.out.println(u);
     String brand=resultset.getString(2);
    System.out.println(brand);
    
    String type=resultset.getString(3);
    System.out.println(type);
    
    String price=resultset.getString(4);
    System.out.println(price);
    
    String expdate=resultset.getString("ExpDate");
    System.out.println(expdate);
      }
      else 
      {
    	  System.out.println("not found");
      }
    
    
		
		
		
	}

}
