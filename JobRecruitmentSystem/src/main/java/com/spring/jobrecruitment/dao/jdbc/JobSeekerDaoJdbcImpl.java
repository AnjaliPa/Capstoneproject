package com.spring.jobrecruitment.dao.jdbc;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.spring.jobrecruitment.dao.JobSeekerDao;
import com.spring.jobrecruitment.domain.JobSeeker;



@Repository("JobSeekerDaoJdbcImpl")
public class JobSeekerDaoJdbcImpl implements JobSeekerDao {

	@Autowired
	private DataSource dataSource;
	private JdbcTemplate dbTemplate;
	private SimpleJdbcInsert jdbcInsert;
	
	@PostConstruct
	public void setup() {
		dbTemplate = new JdbcTemplate(dataSource);
		jdbcInsert = new SimpleJdbcInsert(dataSource);
		jdbcInsert.withTableName("userinfo");
		jdbcInsert.usingGeneratedKeyColumns("id");
		
	}
	
	public Map<String, Object> getJobSeekParams(JobSeeker jobseeker) {
		Map<String, Object> jobsekerParams = new HashMap<String, Object>();
		
		
		jobsekerParams.put("lastName", jobseeker.getLastName());
		jobsekerParams.put("firstName", jobseeker.getFirstName());
		jobsekerParams.put("email", jobseeker.getEmail());
		jobsekerParams.put("password", jobseeker.getPassword());

		return jobsekerParams;
	}
	
	@Override
	public void insertJobSeeker(JobSeeker jobseeker) {
		long id;
		Map<String, Object> jobParams = getJobSeekParams(jobseeker);
		Number newId = jdbcInsert.executeAndReturnKey(jobParams);
		id = newId.longValue();
		jobseeker.setId(id);		
	}

	@Override
	public boolean checkJobSeekerCrediential(JobSeeker jobseeker) {
		boolean validuser = false;
		String sql = "Select count(*) from userinfo where email= ? and password= ? ";
		String email = jobseeker.getEmail();
		String password = jobseeker.getPassword();
		int count = dbTemplate.queryForInt(sql,email,password);
		System.out.println(sql+"======="+count);
		if(count==1){
			validuser = true;
		}
		return validuser;
	}

}
