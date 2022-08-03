package com.xworkz.bottel.Read;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RolexSingleValuesPassingDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	 Class.forName("com.mysql.cj.jdbc.Driver");

	 Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Rolex","root","2ka17cv405@94");
	  
	 String  sql="select*from rolex.rolexdemo where shape='circular'";
	 Statement statement=connection.createStatement();
		
     ResultSet resultset = statement.executeQuery(sql);
  
     boolean result=resultset.next();
       System.out.println(result);
    
       if(result) { 
  int id =resultset.getInt(1);
  System.out.println(id);
   
     String shape=resultset.getString(2);
	System.out.println(shape);
	
	String beltcolour =resultset.getString(3);
	System.out.println(beltcolour);
	
	String typeofwatch=resultset.getString(4);
	System.out.println(typeofwatch);
	
String warranty=resultset.getString(5);
	System.out.println(warranty);
	}
     else 
    {
  	  System.out.println("not found");
    }
  

		
	}	
	}


