package com.xworkz.bottel.Read;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CigerratePassingSingleValues {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 Class.forName("com.mysql.cj.jdbc.Driver");

		 Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Cigerrate","root","2ka17cv405@94");
		  
		 String  sql="select *from Cigerrate.CigerrateDemo where colour='Blue'";
		 Statement statement=connection.createStatement();
			
	     ResultSet resultset = statement.executeQuery(sql);
	  
	     boolean result=resultset.next();
	       System.out.println(result);
	    
	       if(result) { 
	  int id =resultset.getInt(1);
	  System.out.println(id);
	   
	     String brand=resultset.getString(2);
		System.out.println(brand);
		
		String colour =resultset.getString(4);
		System.out.println(colour);
		
		String price=resultset.getString(3);
		System.out.println(price);
		
	String length=resultset.getString(5);
		System.out.println(length);
		}
	     else 
	    {
	  	  System.out.println("not found");
	    }
	  

			
		}	
		}





