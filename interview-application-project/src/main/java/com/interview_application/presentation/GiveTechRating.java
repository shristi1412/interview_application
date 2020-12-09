package com.interview_application.presentation;
import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

import com.interview_application.dto.GiveTechRatingDTO;
import com.interview_application.entity.CandidateEntity;
import com.interview_application.entity.InterviewSchedulerEntity;
import com.interview_application.exception.RatingNotFoundException;
//import com.interview_application.exceptions.CandidateNotFoundException;
import com.interview_application.presentation.GiveTechRating;
import com.interview_application.service.GiveTechRatingService;
import com.interview_application.service.GiveTechRatingServiceImpl;

public class GiveTechRating {
	private static Logger logger = LogManager.getLogger(GiveTechRating.class.getName());
	GiveTechRatingService techratingService =(GiveTechRatingService) new GiveTechRatingServiceImpl();
	
	

}
