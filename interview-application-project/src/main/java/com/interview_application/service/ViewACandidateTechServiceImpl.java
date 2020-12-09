package com.interview_application.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interview_application.dao.ViewACandidateTechDAO;
import com.interview_application.dao.ViewACandidateTechDAOImpl;
import com.interview_application.dto.Candidate;
import com.interview_application.entity.CandidateEntity;
import com.interview_application.exception.CandidateNotFoundTechException;
import com.interview_application.presentation.ViewACandidateForTech;
import com.interview_application.service.ViewACandidateTechServiceImpl;
import com.interview_application.utils.InterviewTrackingViewACandidateTechUtils;

public class ViewACandidateTechServiceImpl implements ViewACandidateTechService{
	
	private static Logger logger = LogManager.getLogger(ViewACandidateTechServiceImpl.class.getName());
	ViewACandidateTechDAO viewACandidateTechDAO = new ViewACandidateTechDAOImpl();
	
	public Candidate findById(String candidateid) throws CandidateNotFoundTechException {
		CandidateEntity candidateEntity = viewACandidateTechDAO.findById(candidateid);
		logger.info("CandidateEntity: " + candidateEntity.getCandidateid()+ "Name="+ candidateEntity.getCandidatename()+"Status="+candidateEntity.getInterviewSchedulerEntity());
		return InterviewTrackingViewACandidateTechUtils.convertCandidateEntityIntoCandidate(candidateEntity);
	}

}
