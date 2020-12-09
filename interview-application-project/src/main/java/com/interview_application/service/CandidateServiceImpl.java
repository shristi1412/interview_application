package com.interview_application.service;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.interview_application.dao.CandidateDAO;
import com.interview_application.dao.CandidateDAOImpl;
import com.interview_application.dto.Candidate;
import com.interview_application.entity.CandidateEntity;
import com.interview_application.exception.CandidateNotFoundException;
import com.interview_application.utils.CandidateUtils;

public class CandidateServiceImpl implements CandidateService{
	
	private static Logger logger = LogManager.getLogger(CandidateDAOImpl.class.getName());	
	CandidateDAO candidateDao = new CandidateDAOImpl();
	
	
	public void addCandidate(CandidateEntity candidateEntity)throws CandidateNotFoundException{
		logger = LogManager.getLogger(CandidateServiceImpl.class.getName());
		candidateDao.addCandidate(candidateEntity);
	}
	
	
	public Candidate findByCandidateID(int candidateid)throws CandidateNotFoundException{
		CandidateEntity candidateEntity = candidateDao.findByCandidateID(candidateid);
		logger.info("CandidateEntity: "+candidateEntity);
		return CandidateUtils.convertCandidateEntityIntoCandidate(candidateEntity);
	}
	
	public Boolean viewCandidate() {
		candidateDao.viewCandidate();
		return true;
	}
	
	public Boolean viewCandidateByParticularId(int candidateid) throws CandidateNotFoundException{
		candidateDao.viewCandidateByParticularId(candidateid);
		return true;
	}

}

