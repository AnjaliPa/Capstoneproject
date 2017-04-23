package com.npu.capstone.dao;

import java.util.List;

import com.npu.capstone.domain.PostJob;

public interface PostJobDao {
	
	public void insertPostJob(PostJob postjob);
	public List<PostJob> findJobs(String jobtitle,String joblocation);

}
