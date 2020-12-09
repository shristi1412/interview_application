package com.interview_application.presentation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interview_application.dto.Candidate;
import com.interview_application.exception.CandidateNotFoundTechException;
import com.interview_application.service.ViewACandidateTechService;
import com.interview_application.service.ViewACandidateTechServiceImpl;

public class ViewACandidateForTech {
	
	private static Logger logger = LogManager.getLogger(ViewACandidateForTech.class.getName());
	ViewACandidateTechService viewACandidateTechService = new ViewACandidateTechServiceImpl();
	
	public Candidate findCandidateById(String candidateid) throws CandidateNotFoundTechException {
		logger.info("Finding candidate for id: " + candidateid);
		Candidate candidate = null;
		try {
			candidate = viewACandidateTechService.findById(candidateid);
		}
		catch(Exception e) {
			logger.error("CandidateNotFoundTechException: " + e);
			throw new CandidateNotFoundTechException(e.getMessage());
		}
		return candidate;
	}



}

	
	

