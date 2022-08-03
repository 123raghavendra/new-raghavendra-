package com.xworkz.bottel.Grapes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class GrapesInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(DBpropertiesGrapes.NAME.getValue());

		Connection connection = DriverManager.getConnection(DBpropertiesGrapes.URL.getValue(),
				DBpropertiesGrapes.USERNAME.getValue(), DBpropertiesGrapes.PASSWORD.getValue());
		System.out.println(connection);

		String insert = "insert into grapesdemo values(10,100,'LightGreen','Round','Sweet')";
		Statement statement = connection.createStatement();
		int noOfRowsAffected = statement.executeUpdate(insert);
		System.out.println(noOfRowsAffected);

	}

}
