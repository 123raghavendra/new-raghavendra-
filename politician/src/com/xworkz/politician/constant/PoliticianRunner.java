package com.xworkz.politician.constant;

import com.xworkz.politician.dao.PoliticianDAO;
import com.xworkz.politician.dao.PoliticianImpl;
import com.xworkz.politician.dto.PoliticianDTO;

public class PoliticianRunner {

	public static void main(String[] args) {

		PoliticianDTO politiciandto=new PoliticianDTO(1,"Raghavendra",PartyNameType.BJP,PresidentNames.BASAVARJBOMMAI,1000,34567890D,10,"GADAG",PartySymbolType.BOOK);

		PoliticianDTO politiciandto1=new PoliticianDTO(2,"Manoj",PartyNameType.CJD,PresidentNames.ASHIWATHNARAYAN,5000,55500000D,10,"Bengaluru",PartySymbolType.CAR);

		PoliticianDTO politiciandto2= new PoliticianDTO(3,"Abhi",PartyNameType.PRAJAKEEYA,PresidentNames.DKSHIVAKUMAR,400,65432313D,30,"Madhur",PartySymbolType.FARMER);

		PoliticianDTO politiciandto3=new PoliticianDTO(4,"Malatesh",PartyNameType.MJD,PresidentNames.JCMADHU,450,5683131313D,22,"Hubbli",PartySymbolType.FAN);

		PoliticianDTO politiciandto4=new PoliticianDTO(5,"Hanumanth",PartyNameType.CJD,PresidentNames.MNAGESH,333,41514114D,33,"Chanapattana",PartySymbolType.KAMALA);

		PoliticianDTO politiciandto5= new PoliticianDTO(6,"Prashant",PartyNameType.NKP,PresidentNames.RASHOK,786,97333333D,88,"Chidurga",PartySymbolType.PEN);


		PoliticianDTO politiciandto6=new PoliticianDTO(7,"Dharashan",PartyNameType.CJD,PresidentNames.SIDHRAMYA,876,999999D,12,"GADAG",PartySymbolType.RADIO);

		PoliticianDAO pDao=new PoliticianImpl();
		pDao.save(politiciandto);
		pDao.save(politiciandto1);
		pDao.save(politiciandto2);
		pDao.save(politiciandto3);
		pDao.save(politiciandto4);
		pDao.save(politiciandto5);
        pDao.save(politiciandto6);    


		System.out.println("===============================");
		PoliticianDTO id=pDao.findBypid(4);
		System.out.println(id);

System.out.println("++++++++++++++++++++++++++++");
    	
		PoliticianDTO pid=pDao.findByIdAndPresident(6,"Rashok");
		System.out.println(pid);
		
System.out.println("****************************");		
PoliticianDTO pid1=pDao.findBypidAndPresidentAndName(1, "Raghavendra","Basavarajbommai" );
System.out.println(pid1);

System.out.println("&^%&^%%^&^%^&^%$%^&*&^%$$%^&&&&&******&&&&&&^%%%%%%%%%%");
PoliticianDTO pid2=pDao.findBypidName("Abhi", 3);
System.out.println(pid2);



	}

}
