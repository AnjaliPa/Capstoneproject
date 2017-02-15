package com.spring.jobrecruitment.dao;

import com.spring.jobrecruitment.domain.JobSeeker;

public interface JobSeekerDao {

	public void insertJobSeeker(JobSeeker jobseeker);
	public boolean checkJobSeekerCrediential(JobSeeker jobseeker);
}
