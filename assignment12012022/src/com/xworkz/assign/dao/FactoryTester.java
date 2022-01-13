package com.xworkz.assign.dao;

import com.xworkz.assign.entity.FactoryEntity;

public class FactoryTester {

	public static void main(String[] args) {
		FactoryEntity e=new FactoryEntity(11, "zindal", "Steel", "Bellary", 9999101010L	, "www.zindal.com", "100cr");

		FactoryInterf f=new FactoryImpl();
		
		f.put(e);
	}

}
