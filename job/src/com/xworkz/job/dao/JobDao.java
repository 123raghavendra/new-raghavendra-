package com.xworkz.job.dao;

import com.xworkz.job.constant.Qualification;
import com.xworkz.job.dto.JobDto;

public interface JobDao {
	
	boolean save(JobDto jobdto);
	
	//JobDto findById(Integer id);
	//JobDto findByIdAndDesigination(Integer Id,String desigination,Qualification qualification);
	//JobDto findByAndDesiginationAndQualification()

}
