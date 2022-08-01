package com.xworkz.bar.constant;

import com.xworkz.bar.dao.BarDAO;
import com.xworkz.bar.dao.BarDAOImpl;
import com.xworkz.bar.dto.BarDTO;

public class Runner {
	public static void main(String[] args) {
		
		BarDTO barDto=new BarDTO(2,"raghu", "BTM", BarType.RESORT, 15000D, 15000D*30);
		
		BarDAO bardao=new  BarDAOImpl();
		
		bardao.save(barDto);
		
	}

}
