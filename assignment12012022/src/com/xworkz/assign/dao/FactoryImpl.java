package com.xworkz.assign.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.assign.entity.FactoryEntity;
import com.xworkz.assign.util.EMFUtil;

public class FactoryImpl implements FactoryInterf{

	public void put(FactoryEntity e) {

			EntityManagerFactory entityManagerFactory=EMFUtil.getEntityManagerFactory();
		
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction trans=entityManager.getTransaction();
		trans.begin();
		entityManager.persist(e);
		trans.commit();
		
	}

}
