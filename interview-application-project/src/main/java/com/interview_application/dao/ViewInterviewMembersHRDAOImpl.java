package com.interview_application.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interview_application.dto.InterviewSchedulerDTO;
import com.interview_application.entity.CandidateEntity;
import com.interview_application.entity.InterviewSchedulerEntity;
import com.interview_application.exception.InterviewNotFoundException;
public class ViewInterviewMembersHRDAOImpl implements ViewInterviewMembersHRDAO{
private static Logger logger = LogManager.getLogger(ViewInterviewMembersHRDAOImpl.class.getName());	
private static EntityManager entityManager;
	
	static {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ShopCartAppPU");
		entityManager = entityManagerFactory.createEntityManager();
	}
	public InterviewSchedulerEntity findById(int interviewid) throws InterviewNotFoundException {
		InterviewSchedulerEntity interviewschedulerentity = entityManager.find(InterviewSchedulerEntity.class,interviewid);
		logger.info("Database returned InterviewSchedulerentity: " + interviewschedulerentity );
		if(interviewschedulerentity==null)
			throw new InterviewNotFoundException("Interviewid: " + interviewid);
		return interviewschedulerentity;  
	}
	
	/*public List<CandidateEntity> viewAllUsers() throws NoDataFetchedException {
	
	List<CandidateEntity> list=null;
	Query query = entityManager.createQuery("SELECT users from RegisterUserEntity users");//JPQL
	list = query.getResultList();//Fire JPQL query
	if(list==null)
		throw new NoDataFetchedException("No Entry in Database");	
	return list;
}*/

}







