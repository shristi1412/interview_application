package com.interview_application.dao;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interview_application.dao.GiveTechRatingDAOImpl;
import com.interview_application.entity.CandidateEntity;
import com.interview_application.entity.InterviewSchedulerEntity;
import com.interview_application.exception.CandidateNotFoundException;
import com.interview_application.exception.RatingNotFoundException;

public class GiveTechRatingDAOImpl implements GiveTechRatingDAO{
	private static Logger logger = LogManager.getLogger(GiveTechRatingDAOImpl.class.getName());	
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

	/*public int giveTechRating(InterviewSchedulerEntity esc) throws RatingNotFoundException{
		logger.info("Finding Candidate for id: " + esc.getCadidateIDinter());
		double techrating=0;
		try {
		if ( esc.getCadidateIDinter()=="techpending"){
			if(esc.getFinalstatus()==1) {
		int min=0;
			int max=10;
				 techrating=Math.random()*(max-min+1)+min;
				
		}
		}
		}
		catch(Exception e) {
			logger.error("RatingNotFoundException: " + e);
			throw new RatingNotFoundException(e.getMessage());
		}
		return (int) techrating;
	}*/

	public int giveTechRating(int candidateID) throws RatingNotFoundException{
			logger.info("Finding Candidate for id: " + candidateID);
			double techrating=0;
			try {
			if (candidateID!=0 ){
			int min=0;
				int max=10;
					 techrating=Math.random()*(max-min+1)+min;
					
			}
			}
			catch(Exception e) {
				logger.error("RatingNotFoundException: " + e);
				throw new RatingNotFoundException(e.getMessage());
			}
			return (int) techrating;
		}
}
