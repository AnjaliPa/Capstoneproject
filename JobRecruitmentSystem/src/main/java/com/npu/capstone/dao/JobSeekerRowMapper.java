package com.npu.capstone.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.npu.capstone.domain.JobSeeker;



public class JobSeekerRowMapper implements RowMapper<JobSeeker>{

	@Override
	public JobSeeker mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		
		JobSeeker jobFromDb = new JobSeeker();
		
		jobFromDb.setFirstName(rs.getString("firstName"));
		jobFromDb.setLastName(rs.getString("lastName"));
		jobFromDb.setEmail(rs.getString("email"));
		jobFromDb.setPassword(rs.getString("password"));
		jobFromDb.setId(rs.getInt("id"));
		
		return jobFromDb;
		
	}




}
