package com.service;

import java.sql.SQLException;
import java.util.List;
import com.dao.JobListingDaoImpl;
import com.dao.JobListingDao;
import com.model.Applicant;

public class JobListingService {
    JobListingDao dao=new JobListingDaoImpl();
	public List<Applicant> findAll() throws SQLException{
		return dao.findAll();
	}

}
