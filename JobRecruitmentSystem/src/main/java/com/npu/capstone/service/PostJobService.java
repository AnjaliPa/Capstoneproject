package com.npu.capstone.service;

import java.util.List;

import com.npu.capstone.domain.PostJob;

public interface PostJobService {

	public void postjob(PostJob postjob);
	public List<PostJob> getJobList(String jobtitle,String joblocation);

}
