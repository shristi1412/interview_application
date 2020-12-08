package com.interview_application.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interview_application.entity.InterviewSchedulerEntity;
import com.interview_application.exception.InterviewNotFoundException;
import com.interview_application.exception.RatingNotFoundException;

public class UpdateInterviewScheduleDAOImpl implements UpdateInterviewScheduleDAO{
	
	private static Logger logger = LogManager.getLogger(UpdateInterviewScheduleDAOImpl.class.getName());	
	private static EntityManager entityManager;
	
	static {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ShopCartAppPU");
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	public InterviewSchedulerEntity findById(int interviewID) throws InterviewNotFoundException {
		InterviewSchedulerEntity interviewSchedulerEntity = entityManager.find(InterviewSchedulerEntity.class, interviewID);
		logger.info("Database returned InterviewSchedulerEntity: " + interviewSchedulerEntity);
		if(interviewSchedulerEntity==null)
			throw new InterviewNotFoundException("InterviewId: " + interviewID);
		return interviewSchedulerEntity;
	}
		
		
		public InterviewSchedulerEntity findById(int techrating, int hrrating) throws RatingNotFoundException {
			InterviewSchedulerEntity interviewSchedulerEntity1 = entityManager.find(InterviewSchedulerEntity.class, "value");
			logger.info("Database returned InterviewSchedulerEntity: " + interviewSchedulerEntity1);
			if(interviewSchedulerEntity1==null)
				throw new RatingNotFoundException("InterviewId: " + "value");
			return interviewSchedulerEntity1;
	}
}
