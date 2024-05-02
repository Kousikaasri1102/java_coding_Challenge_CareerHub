package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.model.JobListing;

public interface CompanyDao {

	int save(JobListing job) throws SQLException;

	List<JobListing> findAll() throws SQLException ;

}
