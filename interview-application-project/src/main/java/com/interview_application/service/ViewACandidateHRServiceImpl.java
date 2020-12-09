package com.interview_application.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interview_application.dao.ViewACandidateHRDAO;
import com.interview_application.dao.ViewACandidateHRDAOImpl;
import com.interview_application.dto.Candidate;
import com.interview_application.entity.CandidateEntity;
import com.interview_application.exception.CandidateNotFoundException;
import com.interview_application.utilities.ViewCandidateForHRUtils;

public class ViewACandidateHRServiceImpl implements ViewACandidateHRService{
	
	private static Logger logger = LogManager.getLogger(ViewACandidateHRServiceImpl.class.getName());
	ViewACandidateHRDAO viewACandidateHRDAO = new ViewACandidateHRDAOImpl();
	
	public Candidate findById(int candidateid) throws CandidateNotFoundException {
		CandidateEntity candidateEntity = viewACandidateHRDAO.findById(candidateid);
		logger.info("CandidateEntity: " + candidateEntity);
		return ViewCandidateForHRUtils.convertCandidateEntityIntoCandidate(candidateEntity);
	}

}
