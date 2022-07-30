package com.xworkz.bottel.Perfume;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PerfumeUpdate {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		  Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/perfume1","root","2ka17cv405@94");
			System.out.println(connection);
			
			String update="update perfume1.Company_info set ExpDate='12/6/94' where ExpDate='10/6/20'";
			Statement statement=connection.createStatement();
	       int noOfRowsAffected=statement.executeUpdate(update);
	       System.out.println(noOfRowsAffected);
		
		
		
	}

}
