package com.service;

import com.model.JobListing; 
import com.dao.CompanyDaoImpl;
import com.dao.CompanyDao;
import java.sql.SQLException;
import java.util.List;



public class CompanyService {
       CompanyDao dao=new CompanyDaoImpl();
	public int insert(JobListing job) throws SQLException {
		return dao.save(job);
	}
	public List<JobListing> findAll() throws SQLException{
		return dao.findAll();
	}

}
