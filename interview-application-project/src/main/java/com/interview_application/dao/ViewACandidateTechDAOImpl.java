package com.interview_application.dao;

//import java.util.ArrayList;
//import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
//import javax.persistence.Query;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interview_application.entity.CandidateEntity;
import com.interview_application.exception.CandidateNotFoundTechException;
import com.interview_application.entity.InterviewSchedulerEntity;

public class ViewACandidateTechDAOImpl implements ViewACandidateTechDAO{
	
	private static Logger logger=LogManager.getFormatterLogger(ViewACandidateTechDAOImpl.class.getName());
	private static EntityManager entityManager;
	
	static {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("InterviewTracking");
		entityManager= entityManagerFactory.createEntityManager();	
	}
	
	public CandidateEntity findById(String candidateid) throws CandidateNotFoundTechException{
		
		CandidateEntity candidateEntity=entityManager.find(CandidateEntity.class, candidateid);
		if (candidateEntity == null) {
			throw new CandidateNotFoundTechException("Candidate id "+candidateid+"not found");
		}
		return candidateEntity;
		
	}
	
	/*Query query = entityManager.createQuery("Select mark from Market mark"); //JPQL
		List<Market> questions = query.getResultList();
		for(Market q: questions) {
			System.out.println("Market = " + q);
		}
		*/

	/*public List<CandidateEntity> viewAllUsers() throws NoDataFetchedException {
		
		List<CandidateEntity> list=null;
		Query query = entityManager.createQuery("SELECT users from RegisterUserEntity users");//JPQL
		list = query.getResultList();//Fire JPQL query
		if(list==null)
			throw new NoDataFetchedException("No Entry in Database");
		
		return list;
	}*/
	
}
	

