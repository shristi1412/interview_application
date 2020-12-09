package com.interview_application.utilities;
import com.interview_application.dto.InterviewSchedulerDTO;
import com.interview_application.entity.InterviewSchedulerEntity;

public class CancelInterviewUtils {
	public static InterviewSchedulerEntity convertInterviewSchedulerEntityIntoInterviewSchedulerDTO(InterviewSchedulerEntity interview) {
		return new InterviewSchedulerEntity(interview.getInterviewID());
	}
	public static InterviewSchedulerDTO convertInterviewSchedulerDTOIntoInterviewSchedulerEntity(InterviewSchedulerDTO interview) {
		return new InterviewSchedulerDTO(interview.getInterviewid());
	}

}
