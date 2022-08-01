package com.xworkz.bar.constant;

public enum MySqlProperties {
 URL("jdbc:mysql://localhost:3306/bar"),USERNAME("root"),SECRET("2ka17cv405@94");
	private String value;
	private MySqlProperties(String value) {
		
		
		
		this.value=value;
		
	}
	public String getValue() {
		return value;
	}
	
}
