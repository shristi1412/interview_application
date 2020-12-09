package com.interview_application.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.interview_application.dto.InterviewSchedulerDTO;
import com.interview_application.entity.InterviewSchedulerEntity;
import com.interview_application.exception.InterviewNotFoundException;
import com.interview_application.dao.CancelInterviewDAO;
import com.interview_application.dao.CancelInterviewDAOImpl;
import com.interview_application.dao.UpdateInterviewScheduleDAO;
import com.interview_application.dao.UpdateInterviewScheduleDAOImpl;
import com.interview_application.utilities.CancelInterviewUtils;
import com.interview_application.utilities.UpdateInterviewScheduleUtils;

public class CancelInterviewServiceImpl implements CancelInterviewService {
	
	private static Logger logger = LogManager.getLogger( UpdateInterviewScheduleServiceImpl.class.getName());
	UpdateInterviewScheduleDAO interviewDao = new UpdateInterviewScheduleDAOImpl();
	
	public InterviewSchedulerEntity findById(int interviewID) throws InterviewNotFoundException {
		InterviewSchedulerEntity interviewSchedulerEntity = interviewDao.findById(interviewID);
		logger.info("InterviewSchedulerEntity: " + interviewSchedulerEntity);
		return UpdateInterviewScheduleUtils.convertInterviewSchedulerEntityIntoInterviewSchedulerDTO(interviewSchedulerEntity);
	}
	

}
