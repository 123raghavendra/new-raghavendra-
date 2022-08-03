package com.xworkz.job.constant;

public enum MySqlProperties {
	URL("jdbc:mysql://localhost:3306/job"),
	USERNAME("root"),
	SECRETE("2ka17cv405");
	
	private String job;
	
	private MySqlProperties(String job) {
		
		this.job=job;
	}
	
    public String getJob() {
		return job;
	}
	}
	


