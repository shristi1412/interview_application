package AddCandidate;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;



import com.interview_application.entity.CandidateEntity;
import com.interview_application.exception.CandidateNotFoundException;
import com.interview_application.presentation.InterviewTracking;



public class InterviewTrackingTest {
	
	private static InterviewTracking interviewTracking;
	private static Logger logger;
	
	
	  
	@BeforeClass
	public static void setUp() {
		logger = LogManager.getLogger(InterviewTracking.class.getName());
		interviewTracking = new InterviewTracking();
	}
	
	@Test
	public void testAddCandidate()throws CandidateNotFoundException
	{
		logger.info("[START] testAddCandidate()");
		
	CandidateEntity candidate = new CandidateEntity("Aman Patidar","Pune","BE Computer Science","Java Developer",3,"Java", "Presentation skills", 2);
		interviewTracking.addCandidate(candidate);
		//Assert.assertEquals(true, candidateDAO.addCandidate(candidate));
		
		logger.info("[END] testAddCandidate()");
		
	}
	
	@Test
	public void testAddCandidateSearchSuccess() throws CandidateNotFoundException {
		logger.info("[START] testAddCandidateSearchSuccess()");
		assertNotNull("Item Found", interviewTracking.findByCandidateID(11));
		logger.info("[END] testAddCandidateSearchSuccess()");
	}
	
	@Test(expected = CandidateNotFoundException.class)
	public void testAddCandidateSearchFailed() throws CandidateNotFoundException {
		logger.info("[START] testAddCandidateSearchFailed()");
		interviewTracking.findByCandidateID(-2);
		logger.info("[END] testAddCandidateSearchFailed()");
	}
}


