package com.interview_application.utilities;

import com.interview_application.dto.Candidate;
import com.interview_application.entity.CandidateEntity;

public class ViewCandidateForHRUtils {
	
	public static CandidateEntity convertCandidateEntityIntoCandidate(Candidate candidate) {
		return new CandidateEntity(candidate.getCandidateID(), candidate.getCandidatename(), candidate.getLocation(),candidate.getDesignation(),candidate.getQualification(),candidate.getExperience(),candidate.getNoticeperiod(),candidate.getPrimaryskills(),candidate.getSecondaryskills(),candidate.getInterviewSchedulerEntity());
	}
	public static Candidate convertCandidateEntityIntoCandidate(CandidateEntity candidateEntity) {
		return new Candidate(candidateEntity.getCandidateID(), candidateEntity.getCandidatename(), candidateEntity.getLocation(),candidateEntity.getDesignation(),candidateEntity.getQualification(),candidateEntity.getExperience(),candidateEntity.getNoticeperiod(),candidateEntity.getPrimaryskills(),candidateEntity.getSecondaryskills(),candidateEntity.getInterviewSchedulerEntity());
	}

}
