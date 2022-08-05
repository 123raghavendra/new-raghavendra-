package com.xworkz.politician.constant;

public enum PresidentNames {
	
	SIDHRAMYA("Sidhramya"),
	DKSHIVAKUMAR("Dkshivakumar"),
	GOVIND("Govind"),
	ASHIWATHNARAYAN("AshiwathNarayan"),
	RASHOK("Rashok"),
	BASAVARJBOMMAI("Basavarajbommai"),
	CTRAVI("Ctravi"),
	JCMADHU("Jcmadhu"),
	PRABHU("Prabhu"),
	MNAGESH("Mnagesh");
	
	
	private String names;
	
	private PresidentNames(String names) {
		this.names=names;
		
	}
	 
	public String getNames() {
		return names;
	}
	public static PresidentNames getBynames(String names) {
		PresidentNames[] presidentNames=PresidentNames.values();
		for(PresidentNames presidentNames2:presidentNames) {
			if(presidentNames2.names.equals(names)) {
				return presidentNames2;
			}
		}
		return null;
		
		
		
	}
}
