package com.interview_application.presentation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interview_application.dto.Candidate;
import com.interview_application.exception.CandidateNotFoundException;
import com.interview_application.service.ViewACandidateHRService;
import com.interview_application.service.ViewACandidateHRServiceImpl;

public class ViewCandidateForHR {
		
		private static Logger logger = LogManager.getLogger(ViewCandidateForHR.class.getName());
		ViewACandidateHRService viewcandidateService =  (ViewACandidateHRService) new ViewACandidateHRServiceImpl();
		
		public Candidate findCandidateById(int candidateID) throws CandidateNotFoundException {
			logger.info("Finding candidate for id: " + candidateID);
			Candidate candidate = null;
			try {
				candidate = viewcandidateService.findById(candidateID);
			}
			catch(Exception e) {
				logger.error("CandidateNotFoundException: " + e);
				throw new CandidateNotFoundException(e.getMessage());
			}
			return candidate;
		}


}
