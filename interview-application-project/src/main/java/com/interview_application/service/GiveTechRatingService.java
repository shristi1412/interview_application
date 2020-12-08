package com.interview_application.service;

import com.interview_application.dto.GiveTechRatingDTO;
import com.interview_application.exceptions.CandidateNotFoundException;
import com.interview_application.presentation.GiveTechRating;

public interface GiveTechRatingService {
	GiveTechRating findById(int candidateID) throws CandidateNotFoundException;
}
