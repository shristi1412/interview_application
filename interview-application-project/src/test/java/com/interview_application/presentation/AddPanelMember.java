package AddPanelMember;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;

import com.interview_application.entity.EmployeeEntity;
import com.interview_application.entity.PanelMemberEntity;
import com.interview_application.exception.EmployeeNotFoundException;
import com.interview_application.presentation.AddPanelMemberController;

public class AddPanelMember {

	private static AddPanelMemberController addPanelMemberController;
	private static Logger logger;
	@BeforeClass
	public static void setUp() {
		logger = LogManager.getLogger(AddPanelMember.class.getName());
		addPanelMemberController = new AddPanelMemberController();
	}
	@Test
	public void testAddSimple() throws EmployeeNotFoundException{
		logger.info("[START] testItemSearchSuccess()");
		EmployeeEntity e = new EmployeeEntity("emp85015", "Ramesh");
		assertEquals(addPanelMemberController.addPanelMember("someone@domain.com", "Mumbai", "HR", e), addPanelMemberController.addPanelMember("someone@domain.com", "Mumbai", "HR", e));
		logger.info("[END] testItemSearchSuccess()");
	}
	@Test
	public void testNotNull() throws EmployeeNotFoundException{
		logger.info("[START] testItemSearchSuccess()");
		EmployeeEntity e = new EmployeeEntity("emp85015", "Ramesh");
		assertNotNull("Employee was added, was found", addPanelMemberController.addPanelMember("someone3@domain.com", "Pune", "Tech", e));
		logger.info("[END] testItemSearchSuccess()");
	}
	@Test
	public void testInvalid() throws EmployeeNotFoundException{
		logger.info("[START] testItemSearchSuccess()");
		EmployeeEntity e = new EmployeeEntity("emp85015", "Ramesh");
		PanelMemberEntity p = addPanelMemberController.addPanelMember("someone2", "Mumbai", "HR", e);
		assertNotNull("Employee was added, was found", p);
		logger.info("[END] testItemSearchSuccess()");
	}
	@Test
	public void testInvalidEmp() throws EmployeeNotFoundException{
		logger.info("[START] testItemSearchSuccess()");
		EmployeeEntity e = new EmployeeEntity("emp85010", "Ramesh");
		PanelMemberEntity p = addPanelMemberController.addPanelMember("someone4@domain.com", "Delhi", "HR", e);
		assertNotNull("Employee was added, was found", p);
		logger.info("[END] testItemSearchSuccess()");
	}

}
