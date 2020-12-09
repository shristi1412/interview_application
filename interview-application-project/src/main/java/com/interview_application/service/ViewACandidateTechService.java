package com.interview_application.service;

import com.interview_application.dto.Candidate;
import com.interview_application.exception.CandidateNotFoundTechException;

public interface ViewACandidateTechService {

	Candidate findById(String candidateid) throws CandidateNotFoundTechException;
}
