package com.interview_application.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.interview_application.entity.InterviewSchedulerEntity;
import com.interview_application.exception.InterviewNotScheduleException;


public class ScheduleInterviewDAOImpl implements ScheduleInterviewDAO {
	
	private static Logger logger = LogManager.getLogger(SharecandidateDAOImpl.class.getName());	
	private static EntityManager entityManager;
	
	static {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ShopCartAppPU");
		entityManager = entityManagerFactory.createEntityManager();
	}
	
public InterviewSchedulerEntity FindById(int interviewid) throws InterviewNotScheduleException{
		InterviewSchedulerEntity interviewSchedulerEntity=entityManager.find(InterviewSchedulerEntity.class, interviewid);
		logger.info("Database returned InterviewSchedulerEntity: " + interviewSchedulerEntity);
		if (interviewSchedulerEntity == null) {
			throw new InterviewNotScheduleException("Interview id "+interviewid+"not found");
		}
		return interviewSchedulerEntity;
	}

}
