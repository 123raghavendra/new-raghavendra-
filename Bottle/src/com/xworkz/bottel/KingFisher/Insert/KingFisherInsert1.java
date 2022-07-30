package com.xworkz.bottel.KingFisher.Insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class KingFisherInsert1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
   
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/kingfisher","root","2ka17cv405@94");
		System.out.println(connection);
		
		String insert="insert into kingfisher.company_info values(10,'KingFisher',300,'3liters','Glass')";
		Statement statement=connection.createStatement();
       int noOfRowsAffected=statement.executeUpdate(insert);
       System.out.println(noOfRowsAffected);
		 
		
	}
}
