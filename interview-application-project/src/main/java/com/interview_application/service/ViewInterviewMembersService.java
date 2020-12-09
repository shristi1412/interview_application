package com.interview_application.service;


import com.interview_application.dto.CandidateDTO;

import com.interview_application.dto.InterviewSchedulerDTO;
import com.interview_application.dto.ViewInterviewMembersDTO;
import com.interview_application.exception.EmployeeNotFoundException;
import com.interview_application.exception.InterviewNotFoundException;
//import com.interview_application.exceptions.CandidateNotFoundException;
import com.interview_application.presentation.ViewInterviewMembers;

public interface ViewInterviewMembersService {
	InterviewSchedulerDTO searchById(String interviewID) throws InterviewNotFoundException;

}
