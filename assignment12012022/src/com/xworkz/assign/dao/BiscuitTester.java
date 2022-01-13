package com.xworkz.assign.dao;

import com.xworkz.assign.entity.BiscuitEntity;

public class BiscuitTester {

	public static void main(String[] args) {
BiscuitEntity e=new BiscuitEntity(11, "Parle", "Nutrilite", "Oats", "12.10.2020", "13.10.2024", 30);
		

		BiscuitInterf biscuit=new BiscuitImpl();
		
		biscuit.put(e);

	}

}
