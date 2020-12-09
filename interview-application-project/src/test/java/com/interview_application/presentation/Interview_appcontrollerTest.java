package com.interview_application.presentation;
import static org.junit.Assert.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;
import com.interview_application.entity.CandidateEntity;
import com.interview_application.entity.InterviewSchedulerEntity;
import com.interview_application.exception.SharecandidateException;


public class Interview_appcontrollerTest {

		private static Interview_appcontroller interview_appcontroller;
		private static Logger logger;

		CandidateEntity candidate;
		@BeforeClass
		public static void setUp() {
			logger = LogManager.getLogger(Interview_appcontroller.class.getName());
			interview_appcontroller =new Interview_appcontroller();
		}
		private static EntityManager entityManager;
		
		static {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ShopCartAppPU");
			entityManager = entityManagerFactory.createEntityManager();
		}
	   
		@Test
		public void testshareSuccess() throws SharecandidateException {
			logger.info("[START] sharecandidateSuccess()");
			assertEquals(true, interview_appcontroller.sharecandidatebyID("CAN000"));
			logger.info("[END] sharecandidateSuccess()");	
		 }
		@Test(expected = SharecandidateException.class)
		public void testshareFailed() throws SharecandidateException {
			logger.info("[START] sharecandidateSuccess()");
			assertEquals(true, interview_appcontroller.sharecandidatebyID("-2"));
			logger.info("[END] sharecandidateSuccess()");
		}
 	   
		
		@Test
		public void testShare()throws  SharecandidateException
		{
			logger.info("[START] testAddCandidate()");
			
			 candidate = new CandidateEntity("CAN000","Yadav","Hyderabad","BE",3,"PHP", "Presentation skills", 3,"Analyst");
			// entityManager.getTransaction().begin();
			 InterviewSchedulerEntity entity=new InterviewSchedulerEntity("IN000",candidate,5,5,"Pune","Pending");
			interview_appcontroller.addCandidate(entity);
			logger.info("Candidate details added successfully!");
			logger.info("[END] testAddCandidate()");
		}
		
		@Test
		public void testshareSuccess1() throws SharecandidateException {
			logger.info("[START] sharecandidateSuccess()");
			assertEquals(true, interview_appcontroller.sharecandidatebyintID("IN000"));
			logger.info("[END] sharecandidateSuccess()");	
		 }
		
     	
     	@Test(expected = SharecandidateException.class)
			public void testshareFailed1() throws SharecandidateException {
				logger.info("[START] sharecandidatebyintSuccess()");
				assertEquals(true, interview_appcontroller.sharecandidatebyintID("2"));
				logger.info("[END] sharecandidatebyintSuccess()");
			}
		}
