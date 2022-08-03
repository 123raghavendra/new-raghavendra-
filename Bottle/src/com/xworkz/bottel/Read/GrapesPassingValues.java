package com.xworkz.bottel.Read;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GrapesPassingValues {

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Grapes","root","2ka17cv405@94");
	  
		String sql="select *from grapes.grapesdemo where  shape ='eliptical'";
		Statement statement=connection.createStatement();
		
    ResultSet resultset = statement.executeQuery(sql);
    
    boolean result=resultset.next();
    
    System.out.println(result);
      //if(result) { 
    int id =resultset.getInt("id");
    System.out.println(id);
     
	double price=resultset.getDouble(2);
	System.out.println(price);
	
	String colour=resultset.getString(3);
	System.out.println(colour);
	
	String Shape=resultset.getString(4);
	System.out.println(Shape);
	
  String taste =resultset.getString(5);
	System.out.println(taste);
	}
       //else 
      //{
    	//  System.out.println("not found");
      //}
   	
	}

