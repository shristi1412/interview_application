package com.interview_application.dao;

import com.interview_application.entity.EmployeeEntity;
import com.interview_application.entity.InterviewSchedulerEntity;
import com.interview_application.exception.InterviewNotScheduleException;
import com.interview_application.exception.SharecandidateException;

public interface ScheduleInterviewDAO {
	
	InterviewSchedulerEntity FindById(int interviewid) throws InterviewNotScheduleException;

}
