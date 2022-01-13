package com.xworkz.assign.dao;

import com.xworkz.assign.entity.SilkManufactureEntity;

public class SilkManufactureTester {

	public static void main(String[] args) {
				
		SilkManufactureEntity smEntity = new SilkManufactureEntity(11, "Nandini", "Mumbai", 9988776644L, "www.nandini.com", 1969, "83.10 cr");
		
		SilkManufactureInterf dao=new SilkManufactureImpl();
		
		dao.put(smEntity);

	}

}
