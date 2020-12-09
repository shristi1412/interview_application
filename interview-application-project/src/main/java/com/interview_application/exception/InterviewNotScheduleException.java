package com.interview_application.exception;

public class InterviewNotScheduleException extends Exception{
private String message;
	
	public InterviewNotScheduleException() {
		this.message = "";
	}
	public InterviewNotScheduleException(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Interview Not Schedule " + this.message;
	}

}
