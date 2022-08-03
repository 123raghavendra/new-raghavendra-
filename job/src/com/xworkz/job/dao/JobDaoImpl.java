package com.xworkz.job.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.job.dto.JobDto;

import static com.xworkz.job.constant.MySqlProperties.*;
public class JobDaoImpl implements JobDao {

	@Override
	
	public boolean save(JobDto jobdto) {
		try {
			Connection connection=DriverManager.getConnection(URL.getJob(), USERNAME.getJob(),SECRETE.getJob());
		String insert ="insert into job.job_info (?,?,?,?,?)";
		PreparedStatement sql=connection.prepareStatement(insert);
		sql.setInt(1, jobdto.getId());
		sql.setString(2,jobdto.getDesigination().getdesigination());
		sql.setDouble(3,jobdto.getAnnualpackage());
		sql.setString(4, jobdto.getQualification().getqualification());
		sql.setDouble(5, jobdto.getPercentage());
		sql.setString(6, jobdto.getfresher);
		
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String insert ="insert into job.job_info(?,?,?,?,?.?)";
		return false;
	}
}
		
	
