package com.interview_application.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interview_application.dao.ViewACandidateHRDAO;
import com.interview_application.dao.ViewACandidateHRDAOImpl;
//import com.interview_application.dto.Candidate;
import com.interview_application.entity.CandidateEntity;
import com.interview_application.exception.CandidateNotFoundException;
import com.interview_application.presentation.ViewCandidateForHR;
//import com.interview_application.utils.ShoppingAppUtils;

public class ViewACandidateHRServiceImpl {

	/*public class CandidateServiceImpl implements ViewACandidateHRService {

		private static Logger logger = LogManager.getLogger(ItemServiceImpl.class.getName());
		ViewACandidateHRDAO candidateDao = new ViewACandidateHRDAOImpl();
		
		public Candidate findById(int candidateID) throws CandidateNotFoundException {
			CandidateEntity candidateEntity = candidateDao.findById(candidateID);
			logger.info("CandidateEntity: " + candidateEntity);
			return ShoppingAppUtils.convertItemEntityIntoItem(candidateEntity);
		}

	}*/

}
