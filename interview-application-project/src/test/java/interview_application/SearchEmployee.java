package interview_application;

import static org.junit.Assert.assertNotNull;

import org.apache.logging.log4j.Logger;
import org.junit.Test;

import com.interview_application.exception.EmployeeNotFoundException;
import com.interview_application.presentation.SearchEmployeeController;

public class SearchEmployee {
	private static SearchEmployeeController searchEmployeeController;
	private static Logger logger;
	@Test
	public void test() throws EmployeeNotFoundException{
//		logger.info("[START] testItemSearchSuccess()");
		assertNotNull("Item Found", searchEmployeeController.searchById("emp85015"));
//		logger.info("[END] testItemSearchSuccess()");
	}

}
