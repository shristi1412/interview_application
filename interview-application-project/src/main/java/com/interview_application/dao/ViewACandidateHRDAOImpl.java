package com.interview_application.dao;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interview_application.entity.CandidateEntity;
import com.interview_application.exception.CandidateNotFoundException;

public class ViewACandidateHRDAOImpl implements ViewACandidateHRDAO {

		private static Logger logger = LogManager.getLogger(ViewACandidateHRDAOImpl.class.getName());	
		private static EntityManager entityManager;
		
		static {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ShopCartAppPU");
			entityManager = entityManagerFactory.createEntityManager();
		}
		public CandidateEntity findById(int candidateID) throws CandidateNotFoundException {
			CandidateEntity viewcandidateEntity = entityManager.find(CandidateEntity.class, candidateID);
			logger.info("Database returned CandidateEntity: " + viewcandidateEntity);
			if(viewcandidateEntity==null)
				throw new CandidateNotFoundException("CandidateId: " + candidateID);
			return viewcandidateEntity;
		}
		public CandidateEntity searchById(String candidateID) {
			// TODO Auto-generated method stub
			return null;
		}

}
