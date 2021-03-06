package com.xworkz.tour.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.tour.entity.TouristEntity;
import com.xworkz.tour.util.EMFUtil;

public class TouristDAOImpl implements TouristDAO{

	@Override
	public void put(TouristEntity entity) {
		
		
		EntityManagerFactory entityManagerFactory=EMFUtil.getEntityManagerFactory();
		
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction trans=entityManager.getTransaction();
		trans.begin();
		entityManager.persist(entity);
		trans.commit();
		
	
		
	}

}
