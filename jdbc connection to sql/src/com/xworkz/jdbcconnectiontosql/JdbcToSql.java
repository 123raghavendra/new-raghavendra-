package com.xworkz.jdbcconnectiontosql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcToSql {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://Localhost:3306/perfume","root","2ka17cv405@94");

		System.out.println(connection);

		String insert="insert into companyinfo values (2,'axe',300,'deo','venilla')";

		Statement statement=connection.createStatement();
		int noOfrowsAffected=statement.executeUpdate(insert);



		System.out.println(noOfrowsAffected);


	}

}
