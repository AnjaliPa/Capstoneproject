package com.npu.capstone.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.npu.capstone.dao.PostJobDao;
import com.npu.capstone.domain.PostJob;


@Service
public class PostJobServiceImpl implements PostJobService {
	
	@Autowired
	@Qualifier("PostJobDaoJdbcImpl")
	private PostJobDao postjobDao;
	

	@Override
	public void postjob(PostJob postjob) {
		postjobDao.insertPostJob(postjob);
	}
	
	@Override
	public List<PostJob> getJobList(String jobtitle,String joblocation) {
		return postjobDao.findJobs(jobtitle,joblocation);
	}


	

}
