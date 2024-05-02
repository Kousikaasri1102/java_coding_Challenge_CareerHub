package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.Applicant;
import com.model.Application;
import com.utility.DBConnection;

public class ApplicantDaoImpl implements ApplicantDao {

	@Override
	public int save(Applicant applicant) throws SQLException {
		Connection con=DBConnection.dbConnect();
		String sql="INSERT INTO applicant(id,first_name,last_name,email,phone,resume) VALUES (?,?,?,?,?,?)";
		PreparedStatement pstmt=con.prepareStatement(sql);	
		pstmt.setInt(1, applicant.getId());
		pstmt.setString(2, applicant.getFirstName());
		pstmt.setString(3, applicant.getLastName());
		pstmt.setString(4, applicant.getEmail());
		pstmt.setInt(5, applicant.getPhone());
		pstmt.setString(6, applicant.getResume());
		int status=pstmt.executeUpdate();
		DBConnection.dbClose();
		return status;
	}

	@Override
	public int save(Application application) throws SQLException {
		Connection con=DBConnection.dbConnect();
		String sql="insert into application(id,job_id,applicant_id,coverletter) values (?,?,?,?);";
		
		PreparedStatement pstmt=con.prepareStatement(sql);	
		pstmt.setInt(1, application.getId());
		pstmt.setInt(2, application.getJobId());
		pstmt.setInt(3, application.getApplicantId());
		pstmt.setString(4,application.getCoverLetter());
		int status=pstmt.executeUpdate();
		DBConnection.dbClose();
		return status;
	}

}
