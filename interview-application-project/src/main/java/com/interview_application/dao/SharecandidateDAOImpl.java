package com.interview_application.dao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.interview_application.entity.CandidateEntity;
import com.interview_application.entity.InterviewSchedulerEntity;
import com.interview_application.exception.SharecandidateException;
public class SharecandidateDAOImpl implements SharecandidateDAO{
	
	private static Logger logger = LogManager.getLogger(SharecandidateDAOImpl.class.getName());	
	private static EntityManager entityManager;
	
	static {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ShopCartAppPU");
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	
	public void addCandidate(InterviewSchedulerEntity entity) throws SharecandidateException {			
			entityManager.getTransaction().begin();
			entityManager.merge(entity);
			entityManager.getTransaction().commit();
			logger.info("Interview details added successfully");
		
	}
	public Boolean sharecandidatebyID(String candidateid) throws SharecandidateException {
		CandidateEntity candidateEntity = entityManager.find(CandidateEntity.class, candidateid);
		logger.info("candidate details share successfully" + candidateEntity);
		if(candidateEntity==null)
			throw new SharecandidateException("candidate " + candidateid+"not share" +"to HR/Tech panel");
		return true;
	}
	public Boolean sharecandidatebyintID(String interviewid) throws SharecandidateException {
		InterviewSchedulerEntity interviewSchedulerEntity = entityManager.find(InterviewSchedulerEntity.class, interviewid);
	    logger.info("candidate details share successfully" + interviewSchedulerEntity);
		if(interviewSchedulerEntity==null)
			throw new SharecandidateException("candidate " + interviewid+"not share" +"to HR/Tech panel");
		return true;
	}
		
}