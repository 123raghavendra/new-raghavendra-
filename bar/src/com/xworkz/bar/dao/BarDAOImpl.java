package com.xworkz.bar.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;
import com.xworkz.bar.dto.BarDTO;
import static com.xworkz.bar.constant.MySqlProperties.*;

public class BarDAOImpl implements BarDAO {

	@Override
	public boolean save(BarDTO barDTO) {

		try {
			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());
			
		 String sql ="insert into bar_inf values("+barDTO.getId()+",'"+barDTO.getName()+"','"+barDTO.getLocation()+"','"+barDTO.getType()+"','"+barDTO.getAvarageCollectionPerDay()+"','"+barDTO.getCollectionPerMonth()+"')";
		 		
		 Statement statement=connection.createStatement();
		 
		 int noOfRowsAffected=statement.executeUpdate(sql);

		 System.out.println(noOfRowsAffected);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

}
