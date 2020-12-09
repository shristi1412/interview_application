package com.interview_application.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interview_application.dao.SharecandidateDAO;
import com.interview_application.dao.SharecandidateDAOImpl;
import com.interview_application.entity.InterviewSchedulerEntity;
import com.interview_application.exception.SharecandidateException;
import com.interview_application.presentation.Interview_appcontroller;

public class ShareserviceImpl implements Shareservice {
		
	private static Logger logger = LogManager.getLogger(Interview_appcontroller.class.getName());

	SharecandidateDAO sharecandidateDAO = new SharecandidateDAOImpl();


	public Boolean sharecandidatebyID(String candidateid) throws SharecandidateException {
		sharecandidateDAO.sharecandidatebyID(candidateid);
		//logger.info("candidateEntity: " + candidateid);
		//return Interview_applicationutils.convertCandidateEntityIntoCandidate(candidateEntity);	
		return true;
	}

	public Boolean sharecandidatebyintID(String interviewid) throws SharecandidateException {
		sharecandidateDAO.sharecandidatebyintID(interviewid);
		//logger.info("candidateEntity: " + interviewid);
		//return Interview_applicationutils.convertCandidateEntityIntoCandidate(candidateEntity);	
		return true;
	}
	public void addCandidate(InterviewSchedulerEntity entity) throws SharecandidateException {			
	{
	logger = LogManager.getLogger(ShareserviceImpl.class.getName());
	sharecandidateDAO.addCandidate(entity);
	}

	}
}
