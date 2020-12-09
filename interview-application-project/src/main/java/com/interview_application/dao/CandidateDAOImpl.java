package com.interview_application.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.interview_application.entity.CandidateEntity;
import com.interview_application.exception.CandidateNotFoundException;


public class CandidateDAOImpl implements CandidateDAO{

	private static Logger logger = LogManager.getLogger(CandidateDAOImpl.class.getName());	
	private static EntityManager entityManager;
	
	static {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("InterviewTracking");
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	
  /*  public List<AddCandidateEntity> getAllCandidates() {
        List<AddCandidateEntity> candidates = entityManager.createQuery("Select a From AddCandidateEntity a", AddCandidateEntity.class).getResultList();
        return candidates;
    }*/
 
	public void addCandidate(CandidateEntity candidate)throws CandidateNotFoundException {
		
			entityManager.getTransaction().begin();
			entityManager.merge(candidate);
			entityManager.getTransaction().commit();
			logger.info("Candidate data inserted successfully");
		
	}
	
	public CandidateEntity findByCandidateID(int candidateid) throws CandidateNotFoundException {
		
		CandidateEntity candidateEntity = entityManager.find(CandidateEntity.class, candidateid);
		logger.info("Database returned AddCandidateEntity: " + candidateEntity);
		if(candidateEntity==null)
			throw new CandidateNotFoundException("CandidateID: " + candidateid);
		return candidateEntity;

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