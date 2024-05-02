package com.service;

import java.sql.SQLException;  

import com.model.Applicant;
import com.model.Application;
import com.dao.ApplicantDaoImpl;
import com.exception.InvalidFormatHandling;
import com.exception.ResourceNotFoundException;
import com.dao.ApplicantDao;

public class ApplicantService {
	ApplicantDao applicantDao=new ApplicantDaoImpl();
	public int insert(Applicant applicant) throws SQLException,InvalidFormatHandling,ResourceNotFoundException {
		
			return applicantDao.save(applicant);
		
	}
	public int insert(Application application) throws SQLException, ResourceNotFoundException{
		
		return applicantDao.save(application);
	
}
	

	
}
