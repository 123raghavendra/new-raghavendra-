package com.xworkz.bottel.Read;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GrapesForLoop {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Grapes","root","2ka17cv405@94");
	  
		String sql="select*from grapes.grapesdemo";
		Statement statement=connection.createStatement();
		
    ResultSet resultset = statement.executeQuery(sql);
    
    while(resultset.next()) {
    int	id=resultset.getInt(1);
    double price= resultset.getDouble(2);
    String colour=resultset.getString(3);
    String shape= resultset.getString(4);
    String taste=resultset.getString(5);
    
    System.out.println("id"+id +"  "+"price"+price+"  "+"colour"+colour+"  "+"shape"+shape+"  "+"taste"+taste);
   }
		
	}

}
