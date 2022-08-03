package com.xworkz.bottel.Read;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LipStickAssignValues {
	public static void main(String[] args)throws ClassNotFoundException, SQLException { 
		
    Class.forName("com.mysql.cj.jdbc.Driver");


    Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/lipstick","root","2ka17cv405@94");
		  
			String sql="select *from lipstick.lipstickdemo where price=100";
			Statement statement=connection.createStatement();
			
	    ResultSet resultset = statement.executeQuery(sql);
	    
	    boolean result=resultset.next();
	    
	    System.out.println(result);
	    // if(result) { 
	    int id =resultset.getInt(1);
	    System.out.println(id);
	     
		String  brand=resultset.getString(2);
		System.out.println(brand);
		
		String type =resultset.getString(3);
		System.out.println(type);
		
		Double price=resultset.getDouble(4);
		System.out.println(price);
		
	  String colour =resultset.getString(5);
		System.out.println(colour);
		
	String expdate	=resultset.getString(6);
		System.out.println(expdate);
		}
	      // else{
	    	//  System.out.println("not found");
	      //}
	    

			
			
		


	}


