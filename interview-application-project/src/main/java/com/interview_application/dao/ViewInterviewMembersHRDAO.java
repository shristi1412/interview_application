package com.interview_application.dao;
import com.interview_application.entity.InterviewSchedulerEntity;
import com.interview_application.exception.InterviewNotFoundException;
import com.interview_application.exception.RatingNotFoundException;

public interface ViewInterviewMembersHRDAO {
	InterviewSchedulerEntity findById(int interviewID) throws InterviewNotFoundException;
	
}
