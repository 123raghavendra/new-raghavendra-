package com.xworkz.politician.constant;

import com.mysql.cj.util.SaslPrep.StringType;

public enum PartySymbolType {
KAMALA("Kamala"),
TV("Tv"),
PHONE("Phone"),
FAN("Fan"),
CYCLE("Cycle"),
CAR("Car"),
PEN("Pen"),
RADIO("Radio"),
BOOK("Book"),
FARMER("Farmer");
	
	private String type;
	
	private PartySymbolType(String type) {
		this.type=type;
	
	}
	
	public String getType() {
		return type;
	}
	public static PartySymbolType getByType(String type) {
		PartySymbolType[] partySymbolTypes=PartySymbolType.values();
		for(PartySymbolType parSymbolType:partySymbolTypes) {
			if(parSymbolType.type.equals(type)) {
				return parSymbolType;
			}
		}
		return null;
		
	}
}

		