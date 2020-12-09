package com.interview_application.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.interview_application.entity.CandidateEntity;
import com.interview_application.exception.CandidateNotFoundException;



public class CandidateDAOImpl implements CandidateDAO{

	private static Logger logger = LogManager.getLogger(CandidateDAOImpl.class.getName());	
	private static EntityManager entityManager;
	
	static {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("InterviewTrackingPU");
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	
	// Function for adding Candidate details
    public void addCandidate(CandidateEntity candidate)throws CandidateNotFoundException {
		
			entityManager.getTransaction().begin();
			entityManager.merge(candidate);
			entityManager.getTransaction().commit();
			logger.info("Candidate data inserted successfully!");
		
	}
    
    //Function for searching the added Candidate details
    public CandidateEntity findByCandidateID(int candidateid) throws CandidateNotFoundException {
		
		CandidateEntity candidateEntity = entityManager.find(CandidateEntity.class, candidateid);
		logger.info("Database returned CandidateEntity: " + candidateEntity);
		if(candidateEntity==null)
			throw new CandidateNotFoundException("CandidateID: " + candidateid);
		return candidateEntity;

	}
	
    //Function for viewing Candidate details
	public Boolean viewCandidate(){
		
		Query query = entityManager.createQuery("SELECT cd from CandidateEntity cd");
		
		List<CandidateEntity> list = query.getResultList();
		for(CandidateEntity candidate: list) {
			
			logger.info("Candidate "+candidate);
		}
		return true;
	}

	//Function for viewing Candidate details by particular Id
	public Boolean viewCandidateByParticularId(int candidateid) throws CandidateNotFoundException{
		
		CandidateEntity candidateEntity = entityManager.find(CandidateEntity.class, candidateid);
		if(candidateEntity==null)
			throw new CandidateNotFoundException("CandidateID: " + candidateid);
		else
			logger.info("Details of candidateid "+ candidateEntity);
		return true;
	}
	
}
