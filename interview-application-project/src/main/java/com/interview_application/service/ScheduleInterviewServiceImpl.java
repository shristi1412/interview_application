package com.interview_application.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interview_application.dao.ScheduleInterviewDAO;
import com.interview_application.dao.ScheduleInterviewDAOImpl;
import com.interview_application.dto.InterviewSchedulerDTO;
import com.interview_application.entity.InterviewSchedulerEntity;
import com.interview_application.exception.InterviewNotScheduleException;
//import com.interview_application.utilities.ScheduleInterviewUtils;


public class ScheduleInterviewServiceImpl implements ScheduleInterviewService {
	
	private static Logger logger = LogManager.getLogger(ScheduleInterviewServiceImpl.class.getName());
	ScheduleInterviewDAO scheduleInterviewDAO= new ScheduleInterviewDAOImpl();
	
	public InterviewSchedulerDTO FindById(int interviewid) throws InterviewNotScheduleException{
		InterviewSchedulerEntity interviewSchedulerEntity = scheduleInterviewDAO.FindById(interviewid);
		logger.info("InterviewID: " + interviewid);
		//return ScheduleInterviewUtils.convertInterviewSchedulerEntityIntoInterviewSchedulerDTO(scheduleInterviewEntity);
		return null;
	}

}
