package com.npu.capstone.dao;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.npu.capstone.domain.JobSeeker;
import com.npu.capstone.domain.Profile;
import com.npu.capstone.domain.Project;

@Repository("ProfileDaoImpl")
public class ProfileDaoImpl implements ProfileDao {

	@Autowired
	private DataSource dataSource;
	private JdbcTemplate dbTemplate;
	private SimpleJdbcInsert jdbcInsert;
	private ProfileRowMapper profileRowMapper;

	@PostConstruct
	public void setup() {
		dbTemplate = new JdbcTemplate(dataSource);
		jdbcInsert = new SimpleJdbcInsert(dataSource).withTableName("profile").usingGeneratedKeyColumns("id");
		profileRowMapper = new ProfileRowMapper();

	}

	@Override
	public void insertProfile(Profile profile) {

		SqlParameterSource params = new BeanPropertySqlParameterSource(profile);
		Number newId = jdbcInsert.executeAndReturnKey(params);
		profile.setId(newId.longValue());

	}

	@Override
	public Profile getProfileParams(long id) {

		String sql = "select * from profile where jobseeker_id = ?";
		long key = id;
		try{
		Profile profileRow = dbTemplate.queryForObject(sql, new Object[] { key }, profileRowMapper);
		if (profileRow != null) {
			return profileRow;
		}
		return new Profile();
		}
		catch( Exception ex){
			return null;
		}
	}

	@Override
	public void updateProfile(Profile profile) {

		String sql = "UPDATE  profile SET email =?, address= ?, jobtitle=?, skills =?, experienceString= ? "
				+ "WHERE jobseeker_id = ?";

		int result = dbTemplate.update(sql, new Object[] { profile.getEmail(), profile.getAddress(),
				profile.getJobtitle(), profile.getSkills(), profile.getExperienceString(), profile.getJobseeker_id() });

	}

	@Override
	public void updateProjectProfile(Project prjtDet, long id) {

		String sql = "UPDATE  profile SET project_det = ?" + "WHERE jobseeker_id = ?";

		int result = dbTemplate.update(sql, new Object[] { prjtDet.getPrjt_desc(), id });
	}

}
