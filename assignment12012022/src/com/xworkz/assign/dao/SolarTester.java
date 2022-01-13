package com.xworkz.assign.dao;


import com.xworkz.assign.entity.SolarsystemEntity;

public class SolarTester {

	public static void main(String[] args) {
		
		SolarsystemEntity entity1=new SolarsystemEntity(656, "Vgaurd", "Steel", 340, 10,"3layered borosilicat tubes",30000);

		
		SolarInterf dao=new SolarImpl();
		
		dao.put(entity1);
		
		
	}

}
