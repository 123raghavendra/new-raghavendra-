package com.xworkz.bar.dto;

import com.xworkz.bar.constant.BarType;
import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BarDTO {
	private Integer id;
	private String name;
	private String location;
	private BarType type=BarType.DEFAULT;
	private Double avarageCollectionPerDay;
	private Double collectionPerMonth;
	
	
	
	
	
	
	
	

}
