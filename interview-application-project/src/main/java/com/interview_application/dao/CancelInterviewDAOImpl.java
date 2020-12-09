package com.interview_application.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interview_application.entity.InterviewSchedulerEntity;
import com.interview_application.exception.InterviewNotFoundException;

public class CancelInterviewDAOImpl implements CancelInterviewDAO{
	
	private static Logger logger = LogManager.getLogger(CancelInterviewDAOImpl.class.getName());	
	private static EntityManager entityManager;
	
	static {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ShopCartAppPU");
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	public InterviewSchedulerEntity findById(String interviewId) throws InterviewNotFoundException {
		InterviewSchedulerEntity interviewSchedulerEntity = entityManager.find(InterviewSchedulerEntity.class, interviewId);
		logger.info("Database returned InterviewSchedulerEntity: " + interviewSchedulerEntity);
		if(interviewSchedulerEntity==null)
			throw new InterviewNotFoundException("InterviewId: " + interviewId);
		return interviewSchedulerEntity;
	}
}

