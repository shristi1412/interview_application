package com.interview_application.dao;

import com.interview_application.entity.InterviewSchedulerEntity;
import com.interview_application.exception.SharecandidateException;

public interface SharecandidateDAO {
	
	
	void addCandidate(InterviewSchedulerEntity entity) throws SharecandidateException;		
		Boolean sharecandidatebyID(String candidateid) throws SharecandidateException;
	
	Boolean sharecandidatebyintID(String interviewid) throws SharecandidateException;
}