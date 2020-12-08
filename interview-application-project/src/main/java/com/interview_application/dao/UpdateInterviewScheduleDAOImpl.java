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
	
	public InterviewSchedulerEntity findById(String interviewId) throws InterviewNotFoundException {
		InterviewSchedulerEntity interviewSchedulerEntity = entityManager.find(InterviewSchedulerEntity.class, interviewId);
		logger.info("Database returned ItemEntity: " + interviewSchedulerEntity);
		if(interviewSchedulerEntity==null)
			throw new InterviewNotFoundException("ItemId: " + interviewId);
		return interviewSchedulerEntity;
	}
		
		
		public InterviewSchedulerEntity findById(int techrating, int hrrating) throws RatingNotFoundException {
			InterviewSchedulerEntity interviewSchedulerEntity1 = entityManager.find(InterviewSchedulerEntity.class, techrating);
			logger.info("Database returned ItemEntity: " + interviewSchedulerEntity1);
			if(interviewSchedulerEntity1==null)
				throw new RatingNotFoundException("ItemId: " + techrating);
			return interviewSchedulerEntity1;
	}
}
