package com.spring.jobrecruitment.services;


import com.spring.jobrecruitment.domain.JobSeeker;

public interface JobSeekerService {



	public void addNewJobSeeker(JobSeeker jobseeker);
	public boolean CheckJobSeekerLogin(JobSeeker jobseeker);

}
