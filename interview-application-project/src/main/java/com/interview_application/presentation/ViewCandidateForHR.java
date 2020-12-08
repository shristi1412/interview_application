package com.interview_application.presentation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interview_application.dto.CandidateDTO;
import com.interview_application.exception.CandidateNotFoundException;
import com.interview_application.service.ViewACandidateHRService;
import com.interview_application.service.ViewACandidateHRServiceImpl;

public class ViewCandidateForHR {
	private static Logger logger = LogManager.getLogger(SearchEmployeeController.class.getName());
	ViewACandidateHRService viewCandidateService = new ViewACandidateHRServiceImpl();
	public CandidateDTO searchById(String candidateID) throws CandidateNotFoundException {
		logger.info("Finding candidate with Candidate ID : " + candidateID);
		CandidateDTO candidate = null;
		try {
			candidate = viewCandidateService.searchById(candidateID);
		}
		catch(Exception e) {
			logger.error("CandidateNotFoundException: " + e);
			throw new CandidateNotFoundException(e.getMessage());
		}
		return candidate;
	}
}
