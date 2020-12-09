package com.interview_application.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interview_application.dao.ViewACandidateHRDAO;
import com.interview_application.dao.ViewACandidateHRDAOImpl;
import com.interview_application.dao.ViewInterviewMembersDAOImpl;
import com.interview_application.dao.ViewInterviewMembersHRDAO;
import com.interview_application.dto.CandidateDTO;
import com.interview_application.dto.InterviewSchedulerDTO;
import com.interview_application.entity.CandidateEntity;
import com.interview_application.entity.InterviewSchedulerEntity;
import com.interview_application.exception.CandidateNotFoundException;
import com.interview_application.utilities.ViewCandidateForHRUtils;

public class ViewInterviewMembersHRServiceImpl implements ViewInterviewMembersHRService {

	 //public ViewInterviewMembersHRServiceImpl()  {
		private static Logger logger = LogManager.getLogger( ViewInterviewMembersHRServiceImpl.class.getName());
		 ViewInterviewMembersHRDAO = new ViewInterviewMembersHRDAOImpl();
			
		public InterviewSchedulerDTO findById(String interviewid) throws CandidateNotFoundException {
			InterviewSchedulerEntity interviewschedulerentity = ViewInterviewMembersHRDAO.searchById(interviewid);
			logger.info("InterviewSchedulerEntity: " + interviewschedulerentity);
			return ViewInterviewMembersDAOImpl.convertInterviewSchedulerEntityIntoInterview(candidateEntity);
			}

		public CandidateDTO searchById(String candidateID) throws CandidateNotFoundException {
			// TODO Auto-generated method stub
			return null;
		}



	}

}
