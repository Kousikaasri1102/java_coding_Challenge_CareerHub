package com.dao;

import java.sql.SQLException;

import com.exception.InvalidFormatHandling;
import com.exception.ResourceNotFoundException;
import com.model.Applicant;
import com.model.Application;


public interface ApplicantDao {
	int save(Applicant applicant) throws SQLException,ResourceNotFoundException,InvalidFormatHandling;
	int save(Application application) throws SQLException,ResourceNotFoundException;
	
}
