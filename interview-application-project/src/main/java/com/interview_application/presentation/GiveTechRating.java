package com.interview_application.presentation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interview_application.dto.GiveTechRatingDTO;
import com.interview_application.exceptions.CandidateNotFoundException;
import com.interview_application.presentation.GiveTechRating;
import com.interview_application.service.GiveTechRatingService;
import com.interview_application.service.GiveTechRatingServiceImpl;

public class GiveTechRating {
	
	private static Logger logger = LogManager.getLogger(GiveTechRating.class.getName());
	GiveTechRatingService techratingService = new GiveTechRatingServiceImpl();
	
	public GiveTechRating findItemById(int candidateID) throws CandidateNotFoundException {
		logger.info("Finding item for id: " + candidateID);
		GiveTechRating trating = null;
		try {
			trating = techratingService.findById(candidateID);
		}
		catch(Exception e) {
			logger.error("ItemNotFoundException: " + e);
			throw new CandidateNotFoundException(e.getMessage());
		}
		return trating;
	}

}
