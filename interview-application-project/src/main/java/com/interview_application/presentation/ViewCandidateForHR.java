package com.interview_application.presentation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//import com.interview_application.dto.Item;
import com.interview_application.exception.CandidateNotFoundException;
//import com.interview_application.ItemService;
//import com.interview_application.ItemServiceImpl;

public class ViewCandidateForHR {

	public class ShoppingAppController {
		
		/*private static Logger logger = LogManager.getLogger(ShoppingAppController.class.getName());
		ItemService itemService = new ItemServiceImpl();
		
		public Item findItemById(int itemId) throws ItemNotFoundException {
			logger.info("Finding item for id: " + itemId);
			Item item = null;
			try {
				item = itemService.findById(itemId);
			}
			catch(Exception e) {
				logger.error("CandidateNotFoundException: " + e);
				throw new CandidateNotFoundException(e.getMessage());
			}
			return item;
		}*/

	}

}
