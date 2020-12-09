package com.interview_application.service;


import com.interview_application.dto.Candidate;
import com.interview_application.entity.CandidateEntity;
import com.interview_application.exception.CandidateNotFoundException;


public interface CandidateService {

	void addCandidate(CandidateEntity candidateEntity)throws CandidateNotFoundException;
	Candidate findByCandidateID(int candidateid)throws CandidateNotFoundException;
	Boolean viewCandidate();
	Boolean viewCandidateByParticularId(int candidateid) throws CandidateNotFoundException;
}
