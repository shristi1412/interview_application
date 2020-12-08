package com.interview_application.service;

public class SurrenderAsHRPanel {

	boolean surrender = false;
	
	public boolean hasSurrendered(int employeeID) {
		if(surrender == false) {
			surrender = true;
		}
		return surrender;
	}
}
