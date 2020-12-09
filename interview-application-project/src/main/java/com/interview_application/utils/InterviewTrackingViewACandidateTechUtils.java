package com.interview_application.utils;

import com.interview_application.dto.Candidate;
import com.interview_application.entity.CandidateEntity;

public class InterviewTrackingViewACandidateTechUtils {
	
	public static CandidateEntity convertCandidateEntityIntoCandidate(Candidate candidate) {
		return new CandidateEntity(candidate.getCandidateid(), candidate.getCandidatename(), candidate.getLocation(),candidate.getDesignation(),candidate.getQualification(),candidate.getExperience(),candidate.getNoticeperiod(),candidate.getPrimaryskill(),candidate.getSecondaryskills(),candidate.getInterviewSchedulerEntity());
	}
	public static Candidate convertCandidateEntityIntoCandidate(CandidateEntity candidateEntity) {
		return new Candidate(candidateEntity.getCandidateid(), candidateEntity.getCandidatename(), candidateEntity.getLocation(),candidateEntity.getDesignation(),candidateEntity.getQualification(),candidateEntity.getExperience(),candidateEntity.getNoticeperiod(),candidateEntity.getPrimaryskill(),candidateEntity.getSecondaryskill(),candidateEntity.getInterviewSchedulerEntity());
	}

}
