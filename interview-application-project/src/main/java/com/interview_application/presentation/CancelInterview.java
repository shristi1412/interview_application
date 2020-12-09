package com.interview_application.presentation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interview_application.exception.InterviewNotFoundException;
import com.interview_application.dto.InterviewSchedulerDTO;
import com.interview_application.entity.InterviewSchedulerEntity;
import com.interview_application.service.CancelInterviewServiceImpl;
import com.interview_application.service.UpdateInterviewScheduleServiceImpl;
import com.interview_application.service.UpdateInterviewScheduleService;
import com.interview_application.service.CancelInterviewService;

public class CancelInterview {
	private static Logger logger = LogManager.getLogger(UpdateInterviewSchedule.class.getName());
	UpdateInterviewScheduleService itemService = new UpdateInterviewScheduleServiceImpl();
	
	public InterviewSchedulerEntity findItemById(String interviewid) throws InterviewNotFoundException {
		logger.info("Finding interviewId: " + interviewid);
		InterviewSchedulerEntity interviewSchedulerEntity = null;
		try {
			interviewSchedulerEntity = itemService.findById(interviewid);
		}
		catch(Exception e) {
			logger.error("InterviewNotFoundException: " + e);
			throw new InterviewNotFoundException(e.getMessage());
		}
		return interviewSchedulerEntity;
	}

}
