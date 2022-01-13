package com.xworkz.assign.dao;

import com.xworkz.assign.entity.MedicineEntity;


public class MedicineTester {

	public static void main(String[] args) {
		
MedicineEntity entity1=new MedicineEntity(1, "Mankind", "Shreyass", "Cold", "13.10.2021", "14.11.2023", 70);

		
		MedicineInterf dao=new MedicineImpl();
		
		dao.put(entity1);

	}

}
