package com.xworkz.assign.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.assign.entity.MedicineEntity;
import com.xworkz.assign.util.EMFUtil;

public class MedicineImpl implements MedicineInterf {

	@Override
	public void put(MedicineEntity entity) {
EntityManagerFactory entityManagerFactory=EMFUtil.getEntityManagerFactory();
		
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction trans=entityManager.getTransaction();
		
		trans.begin();
		entityManager.persist(entity);
		trans.commit();
		
		
	}

}
