package com.xworkz.bottel.Read;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class ReadDemoForLoop {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/perfume1", "root",
				"2ka17cv405@94");

		String sql = "select * from perfume1.company_info";
		Statement statement = connection.createStatement();
		
		ResultSet resultset = statement.executeQuery(sql);

		while (resultset.next()) {
			//AtomicInteger count=new AtomicInteger();
			//count.getAndIncrement();
			int id = resultset.getInt(1);
			String brand = resultset.getString(2);
			String type = resultset.getString(3);
			String price = resultset.getString(4);
			String expdate = resultset.getString(5);
			System.out.println(id + " " + brand + " " + type + " " + price + " " + expdate);
		}
		//System.out.println();

	}

}
