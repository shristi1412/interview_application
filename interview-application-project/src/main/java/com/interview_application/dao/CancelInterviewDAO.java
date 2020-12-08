package com.interview_application.dao;
import com.interview_application.entity.InterviewSchedulerEntity;
import com.interview_application.exception.InterviewNotFoundException;

public interface CancelInterviewDAO {
	InterviewSchedulerEntity findById(String interviewID) throws InterviewNotFoundException;

}

