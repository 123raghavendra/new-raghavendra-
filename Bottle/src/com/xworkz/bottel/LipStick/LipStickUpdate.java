package com.xworkz.bottel.LipStick;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LipStickUpdate {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		  Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/perfume","root","2ka17cv405@94");
			System.out.println(connection);
			
			String update="update lipstick.lipstickdemo set Brand='Organic' where price='100'";
		//String update1="update lipstick.lipstickdemo set expired date='27/6/22' where expired date='10/3/19'";
			Statement statement=connection.createStatement();
	       int noOfRowsAffected=statement.executeUpdate(update);
	       System.out.println(noOfRowsAffected);
		
		
		
	}

}
