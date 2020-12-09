package com.interview_application.presentation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interview_application.exception.InterviewNotFoundException;
import com.interview_application.exception.RatingNotFoundException;
import com.interview_application.dto.InterviewSchedulerDTO;
import com.interview_application.entity.InterviewSchedulerEntity;
import com.interview_application.service.UpdateInterviewScheduleService;
import com.interview_application.service.UpdateInterviewScheduleServiceImpl;


public class UpdateInterviewSchedule {
	
	private static Logger logger = LogManager.getLogger(UpdateInterviewSchedule.class.getName());
	UpdateInterviewScheduleService itemService = new UpdateInterviewScheduleServiceImpl();
	UpdateInterviewScheduleService itemService1 = new UpdateInterviewScheduleServiceImpl();
	
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
	
	public InterviewSchedulerEntity findItemById(int techrating, int hrrating) throws RatingNotFoundException {
		logger.info("Finding rating: " + techrating);
		logger.info("Finding rating: " + hrrating);
		InterviewSchedulerEntity interviewSchedulerEntity = null;
		try {
			interviewSchedulerEntity = itemService1.findById(techrating, hrrating);
		}
		catch(Exception e) {
			logger.error("RatingNotFoundException: " + e);
			throw new RatingNotFoundException(e.getMessage());
		}
		return interviewSchedulerEntity;
	}

	

}
