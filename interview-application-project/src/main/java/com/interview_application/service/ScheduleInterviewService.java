package com.interview_application.service;

import com.interview_application.dto.InterviewSchedulerDTO;
import com.interview_application.exception.InterviewNotScheduleException;

public interface ScheduleInterviewService {
	InterviewSchedulerDTO FindById(int interviewid) throws InterviewNotScheduleException;

}
