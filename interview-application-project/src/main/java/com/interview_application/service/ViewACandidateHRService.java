package com.interview_application.service;

import com.interview_application.dto.Candidate;
import com.interview_application.exception.CandidateNotFoundException;

public interface ViewACandidateHRService {

	Candidate findById(String candidateid) throws CandidateNotFoundException;
}
