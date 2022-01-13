package com.xworkz.tour.dao;

import com.xworkz.tour.entity.TouristEntity;

public class TouristTester {

	public static void main(String[] args) {
		/*EntityManagerFactory entityManangerFactory=Persistence.createEntityManagerFactory("com.xworkz.tour");
		System.out.println(entityManangerFactory);*/
		
		TouristEntity touristEntity = new TouristEntity(11, "Mahabaleshwar", 1353, "Strawberry", 500, "All season");
		
		//TouristEntity touristEntity1 = new TouristEntity(12, "Nashik", 1200, "Tryambakeshwar", 300, "All season");
		
		TouristDAO dao=new TouristDAOImpl();
		//dao.put(touristEntity1);
		dao.put(touristEntity);
		
	}

}
