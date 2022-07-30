package com.xworkz.bottel.LipStick;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LipStickDelete {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	

	
	Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Lipstick","root","2ka17cv405@94");
		System.out.println(connection);
		
		String delete="Delete from Lipstick.LipstickDemo where expiredate ='2/6/19'";
		Statement statement=connection.createStatement();
    int noOfRowsAffected=statement.executeUpdate(delete);
    System.out.println(noOfRowsAffected);

}
}