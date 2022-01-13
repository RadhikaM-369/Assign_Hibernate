package com.xworkz.assign.dao;

import com.xworkz.assign.entity.AirportEntity;

public class AirportTester {

	public static void main(String[] args) {
		AirportEntity e=new AirportEntity(11, "Kempegouda", "Bangalore", 1970, 8877991010L, "www.kairport.com", 500);
		

		AirportInterf airport=new AirportImpl();
		
		airport.put(e);


	}

}
