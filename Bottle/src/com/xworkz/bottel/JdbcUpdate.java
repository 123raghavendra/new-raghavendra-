package com.xworkz.bottel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUpdate {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
            Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/perfume","root","2ka17cv405@94");
		System.out.println(connection);
		
		String update="update perfume.company_info set name='DEO' where type='deo'";
		Statement statement=connection.createStatement();
       int noOfRowsAffected=statement.executeUpdate(update);
       System.out.println(noOfRowsAffected);
		 
	}

}
