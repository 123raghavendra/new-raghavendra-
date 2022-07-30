package com.xworkz.bottel.Rolex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RolexUpdate {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		  Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/rolex","root","2ka17cv405@94");
			System.out.println(connection);
			
			String update="update rolex.rolexdemo set typeofwatch='small' where typeofwatch='extrasmall'";
			Statement statement=connection.createStatement();
	       int noOfRowsAffected=statement.executeUpdate(update);
	       System.out.println(noOfRowsAffected);
		
		
	}

}
