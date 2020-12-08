package com.interview_application.presentation;

import static org.junit.Assert.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;

import SearchEmployee.SearchEmployee;

public class GiveTechRatingTest {
	
	private static GiveTechRating givetechrating;
	private static Logger logger;
	
	@BeforeClass
	public static void setUp() {
		logger = LogManager.getLogger(GiveTechRating.class.getName());
		givetechrating = new GiveTechRating();
	}

	@Test
	public void test() {
		
	}

}
