package com.xworkz.politician.constant;

public enum MySqlProperties {
	URL("jdbc:mysql://localhost:3306/politician"),
	USERNAME("root"),
	SECRET("2ka17cv405@94");
	
	private String value;
	
	MySqlProperties(String value){

		 this.value=value;
	}
		 public String getName() {
			return value;
		}

}
