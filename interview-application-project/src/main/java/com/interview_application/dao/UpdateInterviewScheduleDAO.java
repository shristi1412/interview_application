package com.interview_application.dao;
import com.interview_application.entity.InterviewSchedulerEntity;
import com.interview_application.exception.InterviewNotFoundException;
import com.interview_application.exception.RatingNotFoundException;

public interface UpdateInterviewScheduleDAO {
	InterviewSchedulerEntity findById(String interviewid) throws InterviewNotFoundException;
	
	InterviewSchedulerEntity findById(int techrating, int hrrating) throws RatingNotFoundException;

}
