package com.xworkz.bottel.Cigerrate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CigerrateUpdate {public static void main(String[] args) throws ClassNotFoundException, SQLException {
	  Class.forName("com.mysql.cj.jdbc.Driver");
		
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Cigerrate","root","2ka17cv405@94");
			System.out.println(connection);
			
			String update="update Cigerrate.cigerrateDemo set price='100' where price='10'";
			Statement statement=connection.createStatement();
	       int noOfRowsAffected=statement.executeUpdate(update);
	       System.out.println(noOfRowsAffected);
}

}
