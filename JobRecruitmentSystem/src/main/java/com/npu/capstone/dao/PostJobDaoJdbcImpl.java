package com.npu.capstone.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;
import com.npu.capstone.domain.PostJob;


@Repository("PostJobDaoJdbcImpl")
public class PostJobDaoJdbcImpl implements PostJobDao {
	
	@Autowired
	private DataSource dataSource;
	private JdbcTemplate dbTemplate;
	private SimpleJdbcInsert jdbcInsert;
	private JobRowMapper jobRowMapper;
	//private NamedParameterJdbcTemplate jdbcTemplate;


	@PostConstruct
	public void setup() {
		//jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
		dbTemplate = new JdbcTemplate(dataSource);
		jdbcInsert = new SimpleJdbcInsert(dataSource);
		jdbcInsert.withTableName("postjobinfo");
		jdbcInsert.usingGeneratedKeyColumns("id");
		jobRowMapper = new JobRowMapper();
	}
	
	public Map<String, Object> getPostJobParams(PostJob postjob) {
		Map<String, Object> postjobParams = new HashMap<String, Object>();
		postjobParams.put("companyName", postjob.getCompanyName());
		postjobParams.put("userrole", postjob.getUserrole());
		postjobParams.put("website", postjob.getWebsite());
		postjobParams.put("market", postjob.getMarket());
		postjobParams.put("companysize", postjob.getCompanysize());
		postjobParams.put("jobtitle", postjob.getJobtitle());
		postjobParams.put("description", postjob.getDescription());
		postjobParams.put("jobdescription", postjob.getJobdescription());
		postjobParams.put("primaryRole", postjob.getPrimaryRole());
		postjobParams.put("jobType", postjob.getJobType());
		postjobParams.put("joblocation", postjob.getJoblocation());

		
		return postjobParams;
	}


	@Override
	public void insertPostJob(PostJob postjob) {
		int id;
		Map<String, Object> pjobParams = getPostJobParams(postjob);
		Number newId = jdbcInsert.executeAndReturnKey(pjobParams);
		id = newId.intValue();
		postjob.setId(id);
	}
	
	
	@Override
	public List<PostJob> findJobs(String jobtitle,String joblocation) {
		System.out.println("jobtitle   "+jobtitle);
		if(jobtitle==null)
		{
			jobtitle = "";
		}
		if(joblocation== null)
		{
			joblocation = "";
		}
		String sql = "SELECT * FROM postjobinfo where jobtitle like '%"+jobtitle+"%' and joblocation like '%"+joblocation+"%'";
		System.out.println(sql);
		List<PostJob> postjobtList = dbTemplate.query(sql,jobRowMapper);
		return postjobtList;
	}
	
	/*public PostJob getProductDetails(long id)
	{
		String sql = "SELECT * FROM products where id= '"+id+"'";
		MapSqlParameterSource params = new MapSqlParameterSource("id", id);
		List<PostJob> matchingProduct = dbTemplate.query(sql, params, jobRowMapper);
		System.out.println(sql);
		
		return matchingProduct.get(0);
		
	}*/

}
