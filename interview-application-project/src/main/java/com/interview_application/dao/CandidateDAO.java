package com.interview_application.dao;


import com.interview_application.entity.CandidateEntity;
import com.interview_application.exception.CandidateNotFoundException;


public interface CandidateDAO {
	
	
	void addCandidate(CandidateEntity candidate)throws CandidateNotFoundException;
	CandidateEntity findByCandidateID(int candidateid)throws CandidateNotFoundException;
	
	Boolean viewCandidate();
	Boolean viewCandidateByParticularId(int candidateid) throws CandidateNotFoundException;
}
