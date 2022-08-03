package com.xworkz.bottel.Read;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LipStickAssignAllValuesByLoop {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException { 
		
Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/lipstick","root","2ka17cv405@94");
	  
		String sql="select *from lipstick.lipstickdemo";
		Statement statement=connection.createStatement();
		
    ResultSet resultset = statement.executeQuery(sql);
    
    while(resultset.next()) {
    int	id=resultset.getInt(1);
    String brand= resultset.getString(2);
    String type=resultset.getString(3);
    Double price= resultset.getDouble(4);
    String colour=resultset.getString(5);
    String expdate=resultset.getString(6);
    
    System.out.println(  id+" " +brand+"  "+type+"  "+price +"  "+colour+"  "+expdate );
   }	
	}	
	}


