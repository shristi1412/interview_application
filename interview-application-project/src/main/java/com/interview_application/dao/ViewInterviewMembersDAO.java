package com.interview_application.dao;

import com.interview_application.entity.CandidateEntity;
import com.interview_application.exceptions.CandidateNotFoundException;
import com.interview_application.presentation.ViewInterviewMembers;

public interface ViewInterviewMembersDAO {
	ViewInterviewMembers findById(int candidateID) throws CandidateNotFoundException;
}
