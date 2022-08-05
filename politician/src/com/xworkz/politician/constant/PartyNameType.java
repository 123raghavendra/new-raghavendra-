package com.xworkz.politician.constant;

public enum PartyNameType {
	BJP("Bjp"),KJP("Kjp"),JDS("Jds"),AMMADAMI("Ammadami"),RSS("Rss"),PRAJAKEEYA("Prajakeeya"),
	SSP("Ssp"),MJD("Mjd"),CJD("Cjd"),NKP("Nkp");
	
	private String name;
	
	private PartyNameType(String name) {
		this.name=name;
		
	}

	public String getName() {
		return name;
	}
	public static PartyNameType getByName(String name) {
		PartyNameType[] partyNameTypes=PartyNameType.values();
		for(PartyNameType partyNameType:partyNameTypes) {
			if(partyNameType.name.equals(name));
			return partyNameType;
		}
		return null;
	}
}
