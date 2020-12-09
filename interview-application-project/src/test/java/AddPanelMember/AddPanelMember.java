package AddPanelMember;

import static org.junit.Assert.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;

import com.interview_application.exception.EmployeeNotFoundException;
import com.interview_application.presentation.AddPanelMemberController;

import AddPanelMember.AddPanelMember;

public class AddPanelMember {

	private static AddPanelMemberController addPanelMemberController;
	private static Logger logger;
	@BeforeClass
	public static void setUp() {
		logger = LogManager.getLogger(AddPanelMember.class.getName());
		addPanelMemberController = new AddPanelMemberController();
	}
	@Test
	public void testIDSimple() throws EmployeeNotFoundException{
		logger.info("[START] testItemSearchSuccess()");
		assertEquals(addPanelMemberController.addPanelMember("someone@domain.com", "Mumbai", "HR", "emp85015"), addPanelMemberController.addPanelMember("someone@domain.com", "Mumbai", "HR", "emp85015"));
		logger.info("[END] testItemSearchSuccess()");
	}

}
