package com.npu.capstone.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "postjob")
public class PostJob {
	
	private int id;
	
	
	private String companyName;
	private String userrole;
	private String website;
	private String market;
	private String companysize;
	private String jobtitle;
	private String description;
	private String primaryRole;
	
	private String jobType;
	private String joblocation;
	private  String jobdescription;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getUserrole() {
		return userrole;
	}
	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getMarket() {
		return market;
	}
	public void setMarket(String market) {
		this.market = market;
	}
	public String getCompanysize() {
		return companysize;
	}
	public void setCompanysize(String companysize) {
		this.companysize = companysize;
	}
	public String getJobtitle() {
		return jobtitle;
	}
	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPrimaryRole() {
		return primaryRole;
	}
	public void setPrimaryRole(String primaryRole) {
		this.primaryRole = primaryRole;
	}
	public String getJobType() {
		return jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	public String getJoblocation() {
		return joblocation;
	}
	public void setJoblocation(String joblocation) {
		this.joblocation = joblocation;
	}
	public String getJobdescription() {
		return jobdescription;
	}
	public void setJobdescription(String jobdescription) {
		this.jobdescription = jobdescription;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
}
