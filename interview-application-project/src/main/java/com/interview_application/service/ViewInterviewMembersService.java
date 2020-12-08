package com.interview_application.service;


import com.interview_application.dto.CandidateDTO;
import com.interview_application.dto.ViewInterviewMembersDTO;
import com.interview_application.exception.EmployeeNotFoundException;
import com.interview_application.exceptions.CandidateNotFoundException;
import com.interview_application.presentation.ViewInterviewMembers;

public interface ViewInterviewMembersService {
	CandidateDTO searchById(String candidateID) throws CandidateNotFoundException;

}
