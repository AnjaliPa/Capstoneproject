package com.npu.capstone.dao;

import com.npu.capstone.domain.JobSeeker;
import com.npu.capstone.domain.Profile;
import com.npu.capstone.domain.Project;

public interface ProfileDao {

	
	public void insertProfile( Profile profile );
	public void updateProfile( Profile profile );
	public Profile getProfileParams( long id);
	public void updateProjectProfile( Project prjtDet, long id );
	
}
