package com.interview_application.dao;

import com.interview_application.entity.CandidateEntity;
import com.interview_application.exception.CandidateNotFoundException;

public interface ViewACandidateHRDAO {
	
	CandidateEntity findById(int candidateid) throws CandidateNotFoundException;

}
