package com.interview_application.service;

import com.interview_application.dto.InterviewSchedulerDTO;
import com.interview_application.entity.InterviewSchedulerEntity;
import com.interview_application.exception.InterviewNotFoundException;
import com.interview_application.exception.RatingNotFoundException;

public interface UpdateInterviewScheduleService {
InterviewSchedulerEntity findById(int interviewID) throws InterviewNotFoundException;
	
	InterviewSchedulerEntity findById(int techrating, int hrrating) throws RatingNotFoundException;

}
