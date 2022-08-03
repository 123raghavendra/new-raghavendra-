package com.xworkz.job.constant;

public enum Qualification {
	
	BE("Bachlour_Of_Engineering"),BCA("bca"),MSC("msc"),DEFAULT("degree");
	
	private String qualification;
	
	private Qualification(String qualification) {

		  this.qualification=qualification;
		  
	}

	public String getqualification() {
		return qualification;
	}
}
