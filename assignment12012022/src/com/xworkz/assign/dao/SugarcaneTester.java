package com.xworkz.assign.dao;


import com.xworkz.assign.entity.SugarcaneEntity;

public class SugarcaneTester {

	public static void main(String[] args) {
		SugarcaneEntity e=new SugarcaneEntity(11, "KLS102", "good", 100, 100, 1600, 1960);

		SugarcaneInterf sugar=new SugarcaneImpl();
		
		sugar.put(e);

	}

}
