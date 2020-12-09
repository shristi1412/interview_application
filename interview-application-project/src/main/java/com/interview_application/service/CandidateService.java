package com.interview_application.service;



import com.interview_application.dto.Candidate;
import com.interview_application.entity.CandidateEntity;
import com.interview_application.exception.CandidateNotFoundException;
import com.interview_application.exception.NullValueFoundException;

public interface CandidateService {

	//public List<AddCandidateEntity> getAllCandidates();
	public void addCandidate(CandidateEntity candidateEntity)throws CandidateNotFoundException;
	Candidate findByCandidateID(String candidateid)throws CandidateNotFoundException;
	
	Boolean viewCandidate();
	Boolean viewCandidateByParticularId(String candidateid) throws CandidateNotFoundException;
}
