package com.xworkz.politician.dto;

import java.io.Serializable;

import com.xworkz.politician.constant.PartyNameType;
import com.xworkz.politician.constant.PartySymbolType;
import com.xworkz.politician.constant.PresidentNames;

import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class PoliticianDTO implements Serializable {
	
	
	private Integer pid;
	private String name;
	private  PartyNameType partyName = PartyNameType.RSS;
	private PresidentNames President=PresidentNames.GOVIND;
	private Integer totalMember;
	private Double partyBudject;
	private Integer headQuaters;
	private String partyLocation;
	private PartySymbolType PartySymbol= PartySymbolType.CYCLE;
	
	
	

}
