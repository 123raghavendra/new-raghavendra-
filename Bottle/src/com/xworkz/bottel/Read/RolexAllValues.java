package com.xworkz.bottel.Read;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RolexAllValues {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rolex", "root",
				"2ka17cv405@94");

		String sql = "Select *From rolex.rolexdemo";
		Statement statement = connection.createStatement();
		
		ResultSet resultset = statement.executeQuery(sql);

		while (resultset.next()) {
			//AtomicInteger count=new AtomicInteger();
			//count.getAndIncrement();
			int Sl_No = resultset.getInt(1);
			String shape = resultset.getString(2);
			String  beltofcolour = resultset.getString(3);
			String typeofwatch = resultset.getString(4);
			String  warranty= resultset.getString(5);
			System.out.println(Sl_No + " " + shape+ " " + beltofcolour + " " + typeofwatch + " " + warranty);
		}
		//System.out.println();
}
}
