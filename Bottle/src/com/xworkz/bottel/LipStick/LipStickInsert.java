package com.xworkz.bottel.LipStick;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LipStickInsert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/LipStick","root","2ka17cv405@94");
		System.out.println(connection);
		
		String insert="insert into lipstickdemo values  (10,'Maybelline','pencil',500,'red','3/3/20')";
		Statement statement=connection.createStatement();
       int noOfRowsAffected=statement.executeUpdate(insert);
       System.out.println(noOfRowsAffected);
		 
	}

}
