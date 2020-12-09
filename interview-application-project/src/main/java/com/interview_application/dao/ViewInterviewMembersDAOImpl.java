package com.interview_application.dao;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interview_application.entity.CandidateEntity;
import com.interview_application.entity.InterviewSchedulerEntity;
import com.interview_application.exception.InterviewNotFoundException;
import com.interview_application.exceptions.CandidateNotFoundException;

public abstract class ViewInterviewMembersDAOImpl implements ViewInterviewMembersDAO{
	private static Logger logger = LogManager.getLogger(ViewInterviewMembersDAOImpl.class.getName());	
	private static EntityManager entityManager;
	
	static {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ShopCartAppPU");
		entityManager = entityManagerFactory.createEntityManager();
	}
	public InterviewSchedulerEntity findById(int interviewID) throws InterviewNotFoundException {
		InterviewSchedulerEntity interviewSchedulerEntity = entityManager.find(InterviewSchedulerEntity.class, interviewID);
		logger.info("Database returned CandidateEntity: " + interviewSchedulerEntity);
		if(interviewSchedulerEntity==null)
			throw new InterviewNotFoundException("CandidateId: " + interviewID);
		return interviewSchedulerEntity;
	}
	}
	




