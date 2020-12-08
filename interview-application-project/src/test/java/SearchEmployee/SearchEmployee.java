package SearchEmployee;

import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import com.interview_application.exception.EmployeeNotFoundException;
import com.interview_application.presentation.SearchEmployeeController;

public class SearchEmployee {
	private static SearchEmployeeController searchEmployeeController;
	private static Logger logger;
	@BeforeClass
	public static void setUp() {
		logger = LogManager.getLogger(SearchEmployee.class.getName());
		searchEmployeeController = new SearchEmployeeController();
	}
	@Test
	public void testSimple() throws EmployeeNotFoundException{
		logger.info("[START] testItemSearchSuccess()");
		assertNotNull("Item Found", searchEmployeeController.searchById("emp85015"));
		logger.info("[END] testItemSearchSuccess()");
	}
	@Test
	public void testIncorrect() throws EmployeeNotFoundException{
		logger.info("[START] testItemSearchSuccess()");
		assertNotNull("Item Found", searchEmployeeController.searchById("emp00000"));
		logger.info("[END] testItemSearchSuccess()");
	}

}