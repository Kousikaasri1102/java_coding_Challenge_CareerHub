package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Applicant;
import com.model.JobListing;
import com.utility.DBConnection;

public class JobListingDaoImpl implements JobListingDao{

	@Override
	public List<Applicant> findAll() throws SQLException {
		Connection con=DBConnection.dbConnect();
		String sql="select * from applicant";
		PreparedStatement pstmt=con.prepareStatement(sql);
		ResultSet rst=pstmt.executeQuery();
		List<Applicant> list = new ArrayList<>();
		while(rst.next()==true) {
			int id=rst.getInt("id");
			String first_name=rst.getString("first_name");
			String last_name=rst.getString("last_name");
			
			String email=rst.getString("email");
			
			String resume=rst.getString("resume");
			int phone=rst.getInt("phone");
			
			Applicant app=new Applicant(id,first_name,last_name,email,resume,phone);
			list.add(app);
		}
		DBConnection.dbClose();
		return list;
	}

}
