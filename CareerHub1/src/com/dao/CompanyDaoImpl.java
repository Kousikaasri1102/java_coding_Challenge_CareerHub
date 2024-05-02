package com.dao;

import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.JobListing;

import com.utility.DBConnection;

public class CompanyDaoImpl implements CompanyDao{

	@Override
	public int save(JobListing job) throws SQLException {
		Connection con=DBConnection.dbConnect();
		String sql="INSERT INTO jobListing(id,job_title,job_description, job_location,salary,job_type,company_id) VALUES (?,?,?,?,?,?,?)";
		PreparedStatement pstmt= con.prepareStatement(sql);	
		pstmt.setInt(1, job.getJobId());
		pstmt.setString(2, job.getJobTitle());
		pstmt.setString(3, job.getJobDescription());
		pstmt.setString(4, job.getJobLocation());
		pstmt.setInt(5, job.getSalary());
		pstmt.setString(6, job.getJobtype());
		pstmt.setInt(7, job.getCompanyId());
		int status=pstmt.executeUpdate();
		DBConnection.dbClose();
		return status;
	}

	@Override
	public List<JobListing> findAll() throws SQLException {
		Connection con=DBConnection.dbConnect();
		String sql="select * from jobListing";
		PreparedStatement pstmt=con.prepareStatement(sql);
		ResultSet rst=pstmt.executeQuery();
		List<JobListing> list = new ArrayList<>();
		while(rst.next()==true) {
			int jobId=rst.getInt("id");
			String job_title=rst.getString("job_title");
			String job_description=rst.getString("job_description");
			
			String job_location=rst.getString("job_location");
			int salary=rst.getInt("salary");
			String job_type=rst.getString("job_type");
			int company_id=rst.getInt("company_id");
			
			JobListing job=new JobListing(jobId,job_title,job_description,job_location,salary,job_type,company_id);
			list.add(job);
		}
		DBConnection.dbClose();
		return list;
	}
	

}
