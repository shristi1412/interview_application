package com.interview_application.service;

import com.interview_application.dto.InterviewSchedulerDTO;
import com.interview_application.entity.InterviewSchedulerEntity;
import com.interview_application.exception.InterviewNotFoundException;

public interface CancelInterviewService {
	
	InterviewSchedulerEntity findById(String interviewid) throws InterviewNotFoundException;

}
