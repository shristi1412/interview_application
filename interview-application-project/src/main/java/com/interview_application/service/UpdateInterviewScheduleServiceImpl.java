package com.interview_application.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.interview_application.utilities.UpdateInterviewScheduleUtils;
import com.interview_application.dao.UpdateInterviewScheduleDAOImpl;
import com.interview_application.dao.UpdateInterviewScheduleDAO;
import com.interview_application.dto.InterviewSchedulerDTO;
import com.interview_application.entity.InterviewSchedulerEntity;
import com.interview_application.exception.InterviewNotFoundException;
import com.interview_application.exception.RatingNotFoundException;

public class UpdateInterviewScheduleServiceImpl implements UpdateInterviewScheduleService {
	
	private static Logger logger = LogManager.getLogger( UpdateInterviewScheduleServiceImpl.class.getName());
	UpdateInterviewScheduleDAO interviewDao = new UpdateInterviewScheduleDAOImpl();
	
	public InterviewSchedulerEntity findById(int interviewID) throws InterviewNotFoundException {
		InterviewSchedulerEntity interviewSchedulerEntity = interviewDao.findById(interviewID);
		logger.info("InterviewSchedulerEntity: " + interviewDao);
		return UpdateInterviewScheduleUtils.convertItemEntityIntoItem(interviewSchedulerEntity);
	}
	
	public InterviewSchedulerEntity findById(int techrating , int hrrating ) throws RatingNotFoundException {
		InterviewSchedulerEntity interviewSchedulerEntity1 = interviewDao.findById(techrating,hrrating);
		logger.info("InterviewSchedulerEntity: " + interviewDao);
		return UpdateInterviewScheduleUtils.convertItemEntityIntoItem(interviewSchedulerEntity1);
	}
	
}
