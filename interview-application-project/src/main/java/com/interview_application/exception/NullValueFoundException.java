package com.interview_application.exception;

public class NullValueFoundException extends Exception{
	
			private String message;
			
			public NullValueFoundException() {
				this.message = "";
			}
			public NullValueFoundException(String message) {
				this.message = message;
			}
			@Override
			public String toString() {
				return "Candidate data not found " + this.message;
			}
}

