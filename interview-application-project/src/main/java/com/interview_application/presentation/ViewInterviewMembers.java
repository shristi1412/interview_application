package com.interview_application.presentation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interview_application.dto.CandidateDTO;
import com.interview_application.exception.CandidateNotFoundException;
import com.interview_application.service.ViewInterviewMembersService;
import com.interview_application.service.ViewInterviewMembersServiceImpl;

public class ViewInterviewMembers {
	private static Logger logger = LogManager.getLogger(SearchEmployeeController.class.getName());
	ViewInterviewMembersService viewCandidateService = new ViewInterviewMembersServiceImpl();
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
