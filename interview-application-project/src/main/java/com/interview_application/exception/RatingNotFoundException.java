package com.interview_application.exception;

public class RatingNotFoundException extends Exception {
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String message;
	
	public RatingNotFoundException() {
		this.message = "";
	}
	public RatingNotFoundException(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Rating not found " + this.message;
	}
	

}
