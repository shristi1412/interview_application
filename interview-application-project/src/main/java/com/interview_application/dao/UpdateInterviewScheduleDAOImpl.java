package com.interview_application.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UpdateInterviewScheduleDAOImpl implements UpdateInterviewScheduleDAO{
	
	private static Logger logger = LogManager.getLogger(UpdateInterviewScheduleDAOImpl.class.getName());	
	private static EntityManager entityManager;
	
	static {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ShopCartAppPU");
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	public InterviewIDEntity findById(String interviewId) throws InterviewNotFoundException {
		InterviewIDEntity itemEntity = entityManager.find(ItemEntity.class, itemId);
		logger.info("Database returned ItemEntity: " + itemEntity);
		if(itemEntity==null)
			throw new InterviewNotFoundException("ItemId: " + itemId);
		return itemEntity;
	}
}
