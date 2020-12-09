package com.interview_application.presentation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.interview_application.dto.Candidate;
import com.interview_application.entity.CandidateEntity;
import com.interview_application.exception.CandidateNotFoundException;
import com.interview_application.service.CandidateService;
import com.interview_application.service.CandidateServiceImpl;



public class InterviewTrackingController {
	
	private static Logger logger = LogManager.getLogger(InterviewTrackingController .class.getName());
	CandidateService candidateService = new CandidateServiceImpl();
	
	
	
	public void addCandidate(CandidateEntity candidateEntity)throws CandidateNotFoundException{
		logger.info("Inserting candidate for candidateID: "+ candidateEntity.getCandidateID());
		try {
			candidateService.addCandidate(candidateEntity);
		}catch(Exception e)
		{
			logger.error("CandidateNotFoundException: " + e);
			throw new CandidateNotFoundException(e.getMessage());
		}
	}
	
	
	public Candidate findByCandidateID(int candidateid) throws CandidateNotFoundException {
		logger.info("Finding candidate for candidateID: " + candidateid);
		Candidate addCandidate = null;
		try {
			addCandidate = candidateService.findByCandidateID(candidateid);
		}
		catch(Exception e) {
			logger.error("CandidateNotFoundException: " + e);
			throw new CandidateNotFoundException(e.getMessage());
		}
		return addCandidate;
	}
	
	
	public Boolean viewCandidate() throws CandidateNotFoundException{
		
		Boolean viewcandidate = null;
		try {
			viewcandidate = candidateService.viewCandidate();
		}
		catch(Exception e) {
			logger.error("CandidateNotFoundException: " + e);
			throw new CandidateNotFoundException(e.getMessage());
		}
		return viewcandidate;
		
	}
	
	
	public Boolean viewCandidateByParticularId(int candidateid) throws CandidateNotFoundException {
		logger.info("Finding candidate for candidateID: " + candidateid);
		Candidate addCandidate = null;
		try {
			addCandidate = candidateService.findByCandidateID(candidateid);
		}
		catch(Exception e) {
			logger.error("CandidateNotFoundException: " + e);
			throw new CandidateNotFoundException(e.getMessage());
		}
		return true;
	}
	
	
}



