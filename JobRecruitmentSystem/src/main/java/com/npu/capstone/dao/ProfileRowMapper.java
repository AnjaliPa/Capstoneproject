package com.npu.capstone.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.npu.capstone.domain.Profile;

public class ProfileRowMapper implements RowMapper<Profile>{

	@Override
	public Profile mapRow(ResultSet rs, int rowNum) throws SQLException {
		String email;
		String address;
		String jobtitle;
		String skills;
		String ex;
		String prjt_det;
		
		email = rs.getString("email");
		address = rs.getString("address");
		jobtitle = rs.getString("jobtitle");
		skills = rs.getString("skills");
		ex = rs.getString("experienceString");
		prjt_det = rs.getString("project_det");
		
		Profile profile = new Profile(email, address, jobtitle, skills, ex,prjt_det);
		profile.setId(rs.getLong("id"));
		profile.setJobseeker_id(rs.getLong("jobseeker_id"));
		
		return profile;
	}

}
