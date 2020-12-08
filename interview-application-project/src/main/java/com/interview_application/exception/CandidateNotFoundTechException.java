package com.interview_application.exception;

public class CandidateNotFoundTechException extends Exception{
	private String message;
	
	public CandidateNotFoundTechException() {
		this.message = "";
	}
	public CandidateNotFoundTechException(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Candidate not found for tech interview" + this.message;
	}

}


	

