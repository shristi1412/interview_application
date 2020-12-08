package com.interview_application.service;

import com.interview_application.dto.CandidateDTO;
import com.interview_application.exception.CandidateNotFoundException;

public interface ViewACandidateHRService {
	
	CandidateDTO searchById(String candidateID) throws CandidateNotFoundException;

}
