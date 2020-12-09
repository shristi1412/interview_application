package com.interview_application.dao;

//import java.util.List;

import com.interview_application.entity.CandidateEntity;
import com.interview_application.exception.CandidateNotFoundTechException;



public interface ViewACandidateTechDAO {
	CandidateEntity findById(String candidateid) throws CandidateNotFoundTechException;
	//List<CandidateEntity> viewAllUsers() throws NoDataFetchedException;

}
