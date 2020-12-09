package com.interview_application.exception;

@SuppressWarnings("serial")
public class SharecandidateException extends Exception{
private String message;
	
	public SharecandidateException() {
		this.message = "";
	}
	public SharecandidateException(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return  " "+ this.message;
	}
}

