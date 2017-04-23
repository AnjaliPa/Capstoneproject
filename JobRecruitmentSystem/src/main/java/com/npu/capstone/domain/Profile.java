package com.npu.capstone.domain;


//@XmlRootElement(name = "profile")
public class Profile {
	
	private long id;
	private String email;
	private String address;
	private String jobtitle;
	private String skills;
	private String experienceString;
	private long jobseeker_id;
	private String project_det;
	
	public Profile(){
	
	}
	
	public Profile(String email, String address, String jobtitle, String skills, String experienceString,String project_det) {
		this.email = email;
		this.address = address;
		this.jobtitle = jobtitle;
		this.skills = skills;
		this.experienceString = experienceString;
		this.project_det = project_det;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getJobtitle() {
		return jobtitle;
	}
	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getExperienceString() {
		return experienceString;
	}

	public void setExperienceString(String experienceString) {
		this.experienceString = experienceString;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public long getJobseeker_id() {
		return jobseeker_id;
	}

	public void setJobseeker_id(long jobseeker_id) {
		this.jobseeker_id = jobseeker_id;
	}

	public String getProject_det() {
		return project_det;
	}

	public void setProject_det(String project_det) {
		this.project_det = project_det;
	}
	
	

}
