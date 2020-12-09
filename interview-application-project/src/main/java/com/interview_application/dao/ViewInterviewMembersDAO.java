package com.interview_application.dao;

import com.interview_application.entity.CandidateEntity;
import com.interview_application.entity.InterviewSchedulerEntity;
import com.interview_application.exception.InterviewNotFoundException;
import com.interview_application.exceptions.CandidateNotFoundException;
import com.interview_application.presentation.ViewInterviewMembers;

public interface ViewInterviewMembersDAO {
	InterviewSchedulerEntity findById(int interviewID) throws InterviewNotFoundException;
}
