package com.interview_application.exception;

public class CandidateNotFoundException extends Exception {
	
private String message;
	
	public CandidateNotFoundException() {
		this.message = "";
	}
	public CandidateNotFoundException(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Candidate not found " + this.message;
	}
}

