package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.model.Applicant;

public interface JobListingDao {

	List<Applicant> findAll() throws SQLException;

}
