package com.interview_application.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interview_application.entity.CandidateEntity;
import com.interview_application.entity.PanelMemberEntity;

public class ViewInterviewMembersHRDAOImpl {
	
	private static Logger logger = LogManager.getLogger(ViewInterviewMembersHRDAOImpl.class.getName());	
	private static EntityManager entityManager;

	static {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ShopCartAppPU");
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	public CandidateEntity addPanelMember() throws NullPointerException {
		CandidateEntity CMEntity = entityManager.find(CandidateEntity.class, "some var");
		logger.info("Database returned ItemEntity: " + CMEntity);
		if(CMEntity==null)
			throw new NullPointerException("ItemId: " + "some var");
		return CMEntity;
	}
	
}



