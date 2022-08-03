package com.xworkz.bottel.Read;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CigerratePassingAllValues {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
			
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Cigerrate", "root",
					"2ka17cv405@94");

			String sql = "select*From Cigerrate.cigerrateDemo";
			Statement statement = connection.createStatement();
			
			ResultSet resultset = statement.executeQuery(sql);

			while (resultset.next()) {
				//AtomicInteger count=new AtomicInteger();
				//count.getAndIncrement();
				int id= resultset.getInt(1);
				String brand = resultset.getString(2);
				String  price = resultset.getString(3);
				String colour = resultset.getString(4);
				String  length= resultset.getString(5);
				System.out.println(id+ " " +brand + " " +price + " " + colour + " " + length);
			}
			//System.out.println();
	}
	}
