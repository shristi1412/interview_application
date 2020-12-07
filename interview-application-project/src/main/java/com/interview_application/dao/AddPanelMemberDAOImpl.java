package com.interview_application.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interview_application.dao.AddPanelMemberDAOImpl;
import com.interview_application.entity.PanelMemberEntity;

public class AddPanelMemberDAOImpl {
	
	private static Logger logger = LogManager.getLogger(AddPanelMemberDAOImpl.class.getName());	
	private static EntityManager entityManager;

	static {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ShopCartAppPU");
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	public PanelMemberEntity addPanelMember() throws NullPointerException {
		PanelMemberEntity PMEntity = entityManager.find(PanelMemberEntity.class, "some var");
		logger.info("Database returned ItemEntity: " + PMEntity);
		if(PMEntity==null)
			throw new NullPointerException("ItemId: " + "some var");
		return PMEntity;
	}
	
}
