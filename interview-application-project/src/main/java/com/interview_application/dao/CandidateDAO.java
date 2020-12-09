package com.interview_application.dao;


import com.interview_application.entity.CandidateEntity;
import com.interview_application.exception.CandidateNotFoundException;

import com.interview_application.exception.NullValueFoundException;

public interface CandidateDAO {
	
	//public List<AddCandidateEntity> getAllCandidates();
	void addCandidate(CandidateEntity candidate)throws CandidateNotFoundException;
	CandidateEntity findByCandidateID(String candidateid)throws CandidateNotFoundException;
	
	
	Boolean viewCandidate();
	Boolean viewCandidateByParticularId(String candidateid) throws CandidateNotFoundException;
}
