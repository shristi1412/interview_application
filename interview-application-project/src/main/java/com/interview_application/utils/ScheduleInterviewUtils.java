package com.interview_application.utils;

import com.interview_application.dto.InterviewSchedulerDTO;
import com.interview_application.entity.InterviewSchedulerEntity;

public class ScheduleInterviewUtils {
	
	public static InterviewSchedulerEntity convertInterviewSchedulerEntityIntoInterviewSchedulerDTO(InterviewSchedulerEntity interview) {
		return new InterviewSchedulerEntity(interview.getInterviewid(),interview.getTechrating(),interview.getHrrating());
	}
	public static InterviewSchedulerDTO convertInterviewSchedulerDTOIntoInterviewSchedulerEntity(InterviewSchedulerDTO interview) {
		return new InterviewSchedulerDTO(interview.getInterviewId(),interview.getTechrating(),interview.getHrrating());
	}

}
