package com.xworkz.bottel.Grapes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class GrapesDelete {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Grapes","root","2ka17cv405@94");
			System.out.println(connection);
			
			String delete="Delete from GrapesDemo where colour='red'";
			Statement statement=connection.createStatement();
	       int noOfRowsAffected=statement.executeUpdate(delete);
	       System.out.println(noOfRowsAffected);

		
	}

}
