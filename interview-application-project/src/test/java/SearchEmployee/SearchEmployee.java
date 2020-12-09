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
	public void testIDSimple() throws EmployeeNotFoundException{
		logger.info("[START] testItemSearchSuccess()");
		assertNotNull("Item Found", searchEmployeeController.searchById("emp85015"));
		logger.info("[END] testItemSearchSuccess()");
	}
	@Test
	public void testIDIncorrect() throws EmployeeNotFoundException{
		logger.info("[START] testItemSearchSuccess()");
		assertNotNull("Item Found", searchEmployeeController.searchById("emp00000"));
		logger.info("[END] testItemSearchSuccess()");
	}
	@Test
	public void testNameSimple() throws EmployeeNotFoundException{
		logger.info("[START] testItemSearchSuccess()");
		assertNotNull("Item Found", searchEmployeeController.searchByName("Ramesh"));
		logger.info("[END] testItemSearchSuccess()");
	}
	@Test
	public void testNameIncorrect() throws EmployeeNotFoundException{
		logger.info("[START] testItemSearchSuccess()");
		assertNotNull("Item Found", searchEmployeeController.searchByName("Atul"));
		logger.info("[END] testItemSearchSuccess()");
	}
	@Test
	public void testIDBlank() throws EmployeeNotFoundException{
		logger.info("[START] testItemSearchSuccess()");
		assertNotNull("Item Found", searchEmployeeController.searchById("eMp85015"));
		logger.info("[END] testItemSearchSuccess()");
	}
}
