package com.xworkz.job.constant;

public enum Desigination {
	
SOFTWAREDEVELOPER("softwareengineer"),ASSOICATEENGINEER("assoicateengineer"),
SYSTEMENGINEER("systemengineer"),
DATABASEENGINEER("databaseenginner"),
DEFAULT("softwareengineer");
	
	
 private String  desigination;
 
 private Desigination(String  desigination) {
	 
	 this.desigination= desigination;
	 
	
}
	public String getdesigination() {
		return desigination;
	}
	

}
