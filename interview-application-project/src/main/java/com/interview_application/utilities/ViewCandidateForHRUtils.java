package com.interview_application.utilities;

import com.interview_application.dto.CandidateDTO;
import com.interview_application.entity.CandidateEntity;

public class ViewCandidateForHRUtils {
	public static CandidateEntity convertCandidateIntoCandidateEntity(CandidateDTO candidate) {
		return new CandidateEntity(candidate.getCandidateID(), candidate.getCandidatename(), 
				candidate.getLocation(), candidate.getDesignation(), candidate.getQualification(),  
				candidate.getExperience(), candidate.getNoticeperiod(), candidate.getPrimaryskills(), candidate.getSecondaryskills());
	}
	public static CandidateDTO convertCandidateEntityIntoCandidate(CandidateEntity candidateEntity) {
		return new CandidateDTO(candidateEntity.getCandidateID(), candidateEntity.getCandidatename(), candidateEntity.getLocation(), 
				candidateEntity.getDesignation(), candidateEntity.getQualification(),  candidateEntity.getExperience(), 
				candidateEntity.getNoticeperiod(), candidateEntity.getPrimaryskills(), candidateEntity.getSecondaryskills());
	}
}
