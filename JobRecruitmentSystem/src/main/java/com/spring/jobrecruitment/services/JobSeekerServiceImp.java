package com.spring.jobrecruitment.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring.jobrecruitment.dao.JobSeekerDao;
import com.spring.jobrecruitment.domain.JobSeeker;

@Service
public class JobSeekerServiceImp implements JobSeekerService{

	@Autowired
	@Qualifier("JobSeekerDaoJdbcImpl")
	private JobSeekerDao jobseekerDao;
	
	@Override
	public void addNewJobSeeker(JobSeeker jobseeker) {
		jobseekerDao.insertJobSeeker(jobseeker);
		
	}

	@Override
	public boolean CheckJobSeekerLogin(JobSeeker jobseeker) {
		return jobseekerDao.checkJobSeekerCrediential(jobseeker);

	}

}
