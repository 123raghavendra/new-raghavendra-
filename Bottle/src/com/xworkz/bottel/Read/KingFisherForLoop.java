package com.xworkz.bottel.Read;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class KingFisherForLoop {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/kingfisher","root","2ka17cv405@94");
	  
		String sql="select*from KingFisher.Company_Info";
		Statement statement=connection.createStatement();
		
    ResultSet resultset = statement.executeQuery(sql);
    
    while(resultset.next()) {
    int	id=resultset.getInt(1);
    double price= resultset.getDouble(3);
    String Brand=resultset.getString(2);
    String Capacity= resultset.getString(4);
    String Type=resultset.getString(5);
    
    System.out.println(  id+" " +price+"  "+Brand+"  "+Capacity +"  "+Type);
   }

		
		
		
	}

}
