package com.interview_application.presentation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interview_application.dto.CandidateDTO;
import com.interview_application.dto.InterviewSchedulerDTO;
import com.interview_application.exception.CandidateNotFoundException;
import com.interview_application.service.ViewACandidateHRService;
import com.interview_application.service.ViewACandidateHRServiceImpl;
import com.interview_application.service.ViewInterviewMembersHRService;
import com.interview_application.service.ViewInterviewMembersHRServiceImpl;

public class GiveHRrating {
	private static Logger logger = LogManager.getLogger(GiveHRratingController.class.getName());
	ViewInterviewMembersHRService   viewInterviewMembersHRService = new ViewInterviewMembersHRServiceImpl();
	public InterviewSchedulerDTO searchById(String interviewid) throws CandidateNotFoundException {
		logger.info("Finding candidate with interview ID : " + interviewid);
		InterviewSchedulerDTO candidate = null;
		try {
			candidate = ViewInterviewMembersHRService .searchById(interviewid);
		}
		catch(Exception e) {
			logger.error("CandidateNotFoundException: " + e);
			throw new CandidateNotFoundException(e.getMessage());
		}
		return candidate;
	}
}

