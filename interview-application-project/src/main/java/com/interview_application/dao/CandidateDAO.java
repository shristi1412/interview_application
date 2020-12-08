package com.interview_application.dao;

import java.util.List;

import com.interview_application.entity.CandidateEntity;
import com.interview_application.exception.CandidateNotFoundException;

public interface CandidateDAO {
	
	//public List<AddCandidateEntity> getAllCandidates();
	void addCandidate(CandidateEntity candidate)throws CandidateNotFoundException;
	CandidateEntity findByCandidateID(int candidateID)throws CandidateNotFoundException;
}
