package com.xworkz.job.dto;

import com.xworkz.job.constant.Desigination;
import com.xworkz.job.constant.Qualification;

import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class JobDto {
	
	private Integer id;
	private   Desigination desigination=Desigination.DEFAULT;
	private double annualpackage;
	private  Qualification qualification=Qualification.DEFAULT;
	private double percentage;
	private boolean fresher;
	
	

}
