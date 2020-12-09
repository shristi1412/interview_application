package com.interview_application.dao;

import com.interview_application.entity.CandidateEntity;
import com.interview_application.exception.CandidateNotFoundTechException;

public interface GiveHRratingDAO {
	CandidateEntity findById(int candidateID) throws CandidateNotFoundTechException;
}
