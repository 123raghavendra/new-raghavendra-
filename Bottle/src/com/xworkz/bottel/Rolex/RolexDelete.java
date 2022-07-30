package com.xworkz.bottel.Rolex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RolexDelete {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/rolex","root","2ka17cv405@94");
			System.out.println(connection);
			
			String delete="Delete from rolex.rolexdemo where Warranty='3year'";
			Statement statement=connection.createStatement();
	       int noOfRowsAffected=statement.executeUpdate(delete);
	       System.out.println(noOfRowsAffected);

	}

}
