package com.interview_application.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interview_application.entity.InterviewSchedulerEntity;
import com.interview_application.entity.PanelMemberEntity;

public class GiveRatingsDAOImpl {

	public GiveRatingsDAOImpl() {
		// TODO Auto-generated constructor stub
		
		
		private static Logger logger = LogManager.getLogger(GiveRatingsDAOImpl.class.getName());	
		private static EntityManager entityManager;

		static {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ShopCartAppPU");
			entityManager = entityManagerFactory.createEntityManager();
		}
		
		public InterviewSchedulerEntity addPanelMember() throws NullPointerException {
			InterviewSchedulerEntity	 PMEntity = entityManager.find(InterviewSchedulerEntity.class, "some var");
			logger.info("Database returned ItemEntity: " + PMEntity);
			if(PMEntity==null)
				throw new NullPointerException("ItemId: " + "some var");
			return PMEntity;
		}
		
	}

	}

}
