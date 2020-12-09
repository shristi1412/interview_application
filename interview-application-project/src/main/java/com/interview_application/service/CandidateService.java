package com.interview_application.service;



import com.interview_application.dto.Candidate;
import com.interview_application.entity.CandidateEntity;
import com.interview_application.exception.CandidateNotFoundException;

public interface CandidateService {

	//public List<AddCandidateEntity> getAllCandidates();
	public void addCandidate(CandidateEntity candidateEntity)throws CandidateNotFoundException;
	Candidate findByCandidateID(int candidateid)throws CandidateNotFoundException;
}
