package com.xworkz.politician.dao;

import com.xworkz.politician.dto.PoliticianDTO;

public interface PoliticianDAO {
	
	boolean save(PoliticianDTO dto);
	
	 public PoliticianDTO findBypid(int pid);
	 public PoliticianDTO findByIdAndPresident(int pid,String president);
	
	 public PoliticianDTO findBypidAndPresidentAndName(int pid,String name,String president);
	 public PoliticianDTO findBypidName(String name,int pid);
	 //public String findNameBypid(int pid);
	 //public String findpresidentBypidAndName(String name,int pid);
	
	 //public int getTotal();
	 //public PoliticianDAO findpartyNameByMaxMembers();

}
