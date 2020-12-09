package com.interview_application.utilities;

import com.interview_application.dto.Candidate;
import com.interview_application.entity.CandidateEntity;

public class ViewCandidateForHRUtils {
	
	public static CandidateEntity convertCandidateEntityIntoCandidate(Candidate candidate) {
		return new CandidateEntity(candidate.getCandidateid(), candidate.getCandidatename(), candidate.getLocation(),candidate.getDesignation(),candidate.getQualification(),candidate.getExperience(),candidate.getSecondaryskills(),candidate.getPrimaryskills(),candidate.getNoticeperiod(),candidate.getInterviewSchedulerEntity());
	}
	public static Candidate convertCandidateEntityIntoCandidate(CandidateEntity candidateEntity) {
		return new Candidate(candidateEntity.getCandidateid(), candidateEntity.getCandidatename(), candidateEntity.getLocation(),candidateEntity.getDesignation(),candidateEntity.getQualification(),candidateEntity.getExperience(),candidateEntity.getSecondaryskills(),candidateEntity.getPrimaryskills(),candidateEntity.getNoticeperiod(),candidateEntity.getInterviewSchedulerEntity());
	}

}
