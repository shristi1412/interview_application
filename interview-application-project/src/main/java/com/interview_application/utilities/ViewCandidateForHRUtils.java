package com.interview_application.utilities;


import com.interview_application.dto.Candidate;
import com.interview_application.entity.CandidateEntity;

public class ViewCandidateForHRUtils {
	public static CandidateEntity convertCandidateIntoCandidateEntity(Candidate candidate) {
		return new CandidateEntity(candidate.getCandidateID(), candidate.getCandidatename(), candidate.getLocation(), candidate.getQualification(),
				candidate.getDesignation(), candidate.getExperience(), candidate.getPrimaryskills(), candidate.getSecondaryskills(), 
				candidate.getNoticeperiod());
	}
	public static Candidate convertCandidateEntityIntoCandidate(CandidateEntity candidateEntity) {
		return new Candidate(candidateEntity.getCandidateID(), candidateEntity.getCandidatename(), candidateEntity.getLocation(), candidateEntity.getQualification(),
				candidateEntity.getDesignation(), candidateEntity.getExperience(), candidateEntity.getPrimaryskills(),candidateEntity.getSecondaryskills(), 
				candidateEntity.getNoticeperiod());
	}
}
