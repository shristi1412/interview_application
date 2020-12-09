package com.interview_application.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interview_application.dao.GiveTechRatingDAOImpl;
import com.interview_application.entity.CandidateEntity;
import com.interview_application.exceptions.CandidateNotFoundException;

public class GiveHRratingDAOImpl implements GiveHRratingDAO{
	private static Logger logger = LogManager.getLogger(GiveHRratingDAOImpl.class.getName());	
	private static EntityManager entityManager;
	
	static {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ShopCartAppPU");
		entityManager = entityManagerFactory.createEntityManager();
	}
	public CandidateEntity findById(int candidateID) throws CandidateNotFoundException {
		CandidateEntity candidateEntity = entityManager.find(CandidateEntity.class, candidateID);
		logger.info("Database returned CandidateEntity: " + candidateEntity);
		if(candidateEntity==null)
			throw new CandidateNotFoundException("CandidateId: " + candidateID);
		return candidateEntity;
	}

}
