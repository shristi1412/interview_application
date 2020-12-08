package com.interview_application.service;

//import com.interview_application.dto.*;
import com.interview_application.entity.*;
import com.interview_application.exception.CandidateNotFoundException;

public interface ViewACandidateHRService {
	
	CandidateEntity findById(int candidateID) throws CandidateNotFoundException;

}
