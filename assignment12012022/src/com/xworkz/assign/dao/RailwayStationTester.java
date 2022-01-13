package com.xworkz.assign.dao;

import com.xworkz.assign.entity.RailwayStationEntity;

public class RailwayStationTester {

	public static void main(String[] args) {
		RailwayStationEntity rsEntity=new RailwayStationEntity(101, "Shatabdi Express", "Belgaum", 10, 9900101010L, "www.bgmRail.com", 100);
		
		RailwayStationInterf dao=new RailwayStationImpl();
		
		dao.put(rsEntity);

	}
}
