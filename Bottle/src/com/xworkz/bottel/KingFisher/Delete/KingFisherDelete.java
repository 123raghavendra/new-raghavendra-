package com.xworkz.bottel.KingFisher.Delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class KingFisherDelete {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/KingFisher","root","2ka17cv405@94");
			System.out.println(connection);
			
			String delete="Delete from KingFisher.company_info where price=100";
			Statement statement=connection.createStatement();
	       int noOfRowsAffected=statement.executeUpdate(delete);
	       System.out.println(noOfRowsAffected);

	}

}
