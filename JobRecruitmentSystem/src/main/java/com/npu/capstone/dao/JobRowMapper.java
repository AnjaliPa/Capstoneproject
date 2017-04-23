package com.npu.capstone.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.npu.capstone.domain.PostJob;


public class JobRowMapper implements RowMapper<PostJob> {
	
	
	public PostJob mapRow(ResultSet resultSet, int row) throws SQLException {
		String jobtitle;
		String jobType;
		String companyName;
		String website;
		String joblocation;
		String jobdescription;
		
		int id;
		PostJob postJob;
		
		id= resultSet.getInt("pid");
		jobtitle = resultSet.getString("jobtitle");
		jobType = resultSet.getString("jobType");
		companyName = resultSet.getString("companyName");
		website = resultSet.getString("website");
		joblocation = resultSet.getString("joblocation");
		jobdescription = resultSet.getString("jobdescription");
		
		
		postJob = new PostJob();
		postJob.setJobtitle(jobtitle);
		postJob.setJobType(jobType);
		postJob.setCompanyName(companyName);
		postJob.setJobdescription(jobdescription);
		postJob.setWebsite(website);
		postJob.setJoblocation(joblocation);
		postJob.setId(id);		
		return postJob;
	}

}
