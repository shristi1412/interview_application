package com.interview_application.dao;

public interface UpdateInterviewScheduleDAO {
	InterviewIDEntity findById(String interviewID) throws InterviewNotFoundException;

}
