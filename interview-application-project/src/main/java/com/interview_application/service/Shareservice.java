package com.interview_application.service;

import com.interview_application.entity.InterviewSchedulerEntity;
import com.interview_application.exception.SharecandidateException;

public interface Shareservice {

Boolean sharecandidatebyID(String candidateid)throws SharecandidateException;

Boolean sharecandidatebyintID(String interviewid)throws SharecandidateException;

void addCandidate(InterviewSchedulerEntity entity) throws SharecandidateException; 	





	}
