package com.interview_application.utilities;

import com.interview_application.dto.InterviewSchedulerDTO;
import com.interview_application.entity.InterviewSchedulerEntity;

public class UpdateInterviewScheduleUtils {
	
	public static InterviewSchedulerEntity convertItemIntoItemEntity(InterviewSchedulerDTO interview) {
		return new InterviewSchedulerEntity(interview.getInterviewID(),interview.getTechrating(),interview.getHrrating());
	}
	public static InterviewSchedulerDTO convertItemEntityIntoItem(InterviewSchedulerEntity interview) {
		return new InterviewSchedulerDTO(interview.getInterviewID(),interview.getTechrating(),interview.getHrrating());
	}
}
