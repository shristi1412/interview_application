package com.interview_application.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interview_application.entity.CandidateEntity;
import com.interview_application.exception.CandidateNotFoundException;

public class ViewACandidateHRDAOImpl implements ViewACandidateHRDAO{
	
	private static Logger logger=LogManager.getFormatterLogger(ViewACandidateHRDAOImpl.class.getName());
	private static EntityManager entityManager;
	
	static {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("InterviewTrackingAppPU");
		entityManager= entityManagerFactory.createEntityManager();	
	}
	
	public CandidateEntity findById(int candidateid) throws CandidateNotFoundException{
		
		CandidateEntity candidateEntity=entityManager.find(CandidateEntity.class, candidateid);
		if (candidateEntity == null) {
			throw new CandidateNotFoundException("Candidate id "+candidateid+"not found");
		}
		return candidateEntity;
		
	}
	
	
}
	

