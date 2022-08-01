package com.xworkz.bar.constant;

public enum BarType {
	
	BARANDRESTAURANT("bar_restarant"),RESORT("Resort"),WINESTORE("WineStore"),MSIL("msil"),DEFAULT("restaurant");
	 private String name;
	private BarType(String name) {
	
	this.name=name;
	
	
	}
	public String getName() {
		return name;
	}

}
