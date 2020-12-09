package com.interview_application.presentation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interview_application.dto.CandidateDTO;
import com.interview_application.dto.InterviewSchedulerDTO;
import com.interview_application.exception.CandidateNotFoundException;
import com.interview_application.exception.InterviewNotScheduleException;
import com.interview_application.service.ScheduleInterviewService;
import com.interview_application.service.ScheduleInterviewServiceImpl;

public class ScheduleInterviewController {
	
	private static Logger logger = LogManager.getLogger(ScheduleInterviewController.class.getName());
	ScheduleInterviewService scheduleInterviewService = new ScheduleInterviewServiceImpl();
	
	public InterviewSchedulerDTO FindById(int interviewid) throws InterviewNotScheduleException {
		logger.info("Finding interview with interview ID : " + interviewid);
		InterviewSchedulerDTO interviewSchedulerdto = null;
		try {
			interviewSchedulerdto = scheduleInterviewService.FindById(interviewid);
		}
		catch(Exception e) {
			logger.error("InterviewNotSchduleException: " + e);
			throw new InterviewNotScheduleException(e.getMessage());
		}
		return interviewSchedulerdto;
	}

}
