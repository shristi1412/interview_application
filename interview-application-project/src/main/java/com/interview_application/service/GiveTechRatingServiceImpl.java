package com.interview_application.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interview_application.dao.GiveTechRatingDAO;
import com.interview_application.dao.GiveTechRatingDAOImpl;
import com.interview_application.dto.Candidate;
import com.interview_application.dto.GiveTechRatingDTO;
import com.interview_application.entity.CandidateEntity;
import com.interview_application.exceptions.CandidateNotFoundException;
import com.interview_application.presentation.GiveTechRating;
import com.interview_application.service.GiveTechRatingServiceImpl;
import com.interview_application.utilities.CandidateUtils;
//import com.cg.shoppingapp.utils.ShoppingAppUtils;

public class GiveTechRatingServiceImpl  {
	private static Logger logger = LogManager.getLogger(GiveTechRatingServiceImpl.class.getName());
	GiveTechRatingDAO itemDao = new GiveTechRatingDAOImpl();
	
	public 	Candidate findById(int candidateID) throws CandidateNotFoundException {
		CandidateEntity candidateEntity = itemDao.findById(candidateID);
		logger.info("CandidateEntity: " + candidateEntity);
		return CandidateUtils.convertCandidateEntityIntoCandidate(candidateEntity);
	}

}
