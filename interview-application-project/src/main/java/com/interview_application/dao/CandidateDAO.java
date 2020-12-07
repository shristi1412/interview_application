package com.interview_application.dao;

import com.interview_application.entity.CandidateEntity;
import com.interview_application.exception.CandidateNotFoundException;

public class CandidateDAO {


	public interface ItemDAO {
		CandidateEntity findById(int candidateID) throws CandidateNotFoundException;
	}

}
