package com.interview_application.presentation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interview_application.dto.Candidate;
import com.interview_application.exception.CandidateNotFoundException;
import com.interview_application.service.ViewACandidateHRService;
import com.interview_application.service.ViewACandidateHRServiceImpl;

public class ViewCandidateForHR {
	
	private static Logger logger = LogManager.getLogger(ViewCandidateForHR.class.getName());
	ViewACandidateHRService viewACandidateHRService = new ViewACandidateHRServiceImpl();
	
	public Candidate findCandidateById(int candidateid) throws CandidateNotFoundException {
		logger.info("Finding candidate for id: " + candidateid);
		Candidate candidate = null;
		try {
			candidate = viewACandidateHRService.findById(candidateid);
		}
		catch(Exception e) {
			logger.error("CandidateNotFoundException: " + e);
			throw new CandidateNotFoundException(e.getMessage());
		}
		return candidate;
	}



}

	
	

