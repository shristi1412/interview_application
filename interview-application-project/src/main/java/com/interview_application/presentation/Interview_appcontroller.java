package com.interview_application.presentation;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;


import org.apache.logging.log4j.Logger;

import com.interview_application.dto.Candidate;
import com.interview_application.entity.CandidateEntity;
import com.interview_application.entity.InterviewSchedulerEntity;
import com.interview_application.exception.SharecandidateException;
import com.interview_application.service.Shareservice;
import com.interview_application.service.ShareserviceImpl;
public class Interview_appcontroller {

	private static Logger Logger = LogManager.getLogger(Interview_appcontroller.class.getName());
	 Shareservice shareService = new ShareserviceImpl();
	
	 private static EntityManager entityManager;
		
		static {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ShopCartAppPU");
			entityManager = entityManagerFactory.createEntityManager();
		}
     	public Boolean sharecandidatebyID(String candidateid) throws SharecandidateException {
		Logger.info("Sharing candidate with candidateid: " + candidateid);
		shareService.sharecandidatebyID(candidateid);
			return true ;
		}

		public Boolean sharecandidatebyintID(String interviewid) throws SharecandidateException{
		Logger.info("Sharing candidate with interviewid: " + interviewid);
		shareService.sharecandidatebyintID(interviewid);
			return true ;
		}
		public void addCandidate(InterviewSchedulerEntity entity)throws SharecandidateException{
		   Logger.info("Inserting candidate for candidateID: "+ entity.getInterviewid());
		     try {
			shareService.addCandidate(entity);
		     }catch(Exception e)
		   {
			Logger.error("SharecandidateException: " + e);
			throw new SharecandidateException(e.getMessage());
		  }
	}
}

