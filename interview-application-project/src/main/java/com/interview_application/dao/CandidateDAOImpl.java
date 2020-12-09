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

import com.interview_application.exception.NullValueFoundException;


public class CandidateDAOImpl implements CandidateDAO{

	private static Logger logger = LogManager.getLogger(CandidateDAOImpl.class.getName());	
	private static EntityManager entityManager;
	
	static {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("InterviewTracking");
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	
   public void addCandidate(CandidateEntity candidate)throws CandidateNotFoundException {
		
			entityManager.getTransaction().begin();
			entityManager.merge(candidate);
			entityManager.getTransaction().commit();
			logger.info("Candidate data inserted successfully");
		
	}
	
   
   public CandidateEntity findByCandidateID(String candidateid) throws CandidateNotFoundException {
		
		CandidateEntity candidateEntity = entityManager.find(CandidateEntity.class, candidateid);
		logger.info("Database returned CandidateEntity: " + candidateEntity);
		if(candidateEntity==null)
			throw new CandidateNotFoundException("CandidateID: " + candidateid);
		return candidateEntity;

	}
	
	public Boolean viewCandidate(){
		
		Query query = entityManager.createQuery("SELECT cd from CandidateEntity cd");
		
		List<CandidateEntity> list = query.getResultList();
		for(CandidateEntity candidate: list) {
			
			logger.info("Candidate "+candidate);
		}
		return true;
	}

			
	public Boolean viewCandidateByParticularId(String candidateid) throws CandidateNotFoundException{
		
		CandidateEntity candidateEntity = entityManager.find(CandidateEntity.class, candidateid);
		if(candidateEntity==null)
			throw new CandidateNotFoundException("CandidateID: " + candidateid);
		else
			logger.info("Details of candidateid "+ candidateEntity);
		return true;
	}
	
}

/*
public boolean addEmployee(EmployeeEntity employee) {
try{
    manager.persist(employee);
}catch(Exception e){
    e.printStackTrace();
    return false;
}
return true;
}
*/