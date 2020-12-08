package com.interview_application.presentation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interview_application.dto.GiveTechRatingDTO;
import com.interview_application.entity.CandidateEntity;
import com.interview_application.entity.InterviewSchedulerEntity;
import com.interview_application.exception.RatingNotFoundException;
import com.interview_application.exceptions.CandidateNotFoundException;
import com.interview_application.presentation.GiveTechRating;
import com.interview_application.service.GiveTechRatingService;
import com.interview_application.service.GiveTechRatingServiceImpl;

public class GiveTechRating {
	private static Logger logger = LogManager.getLogger(GiveTechRating.class.getName());
	GiveTechRatingService techratingService =(GiveTechRatingService) new GiveTechRatingServiceImpl();
	
	public int giveTechRating(int candidateID) throws RatingNotFoundException{
		logger.info("Finding Candidate for id: " + candidateID);
		double techrating=0;
		try {
		if (candidateID!=0 ){
		int min=0;
			int max=10;
				 techrating=Math.random()*(max-min+1)+min;
				
		}
		}
		catch(Exception e) {
			logger.error("RatingNotFoundException: " + e);
			throw new RatingNotFoundException(e.getMessage());
		}
		return (int) techrating;
	}

}
