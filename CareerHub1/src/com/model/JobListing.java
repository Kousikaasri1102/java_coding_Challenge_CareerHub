package com.model;



public class JobListing {
	private int jobId;
	private String jobTitle;
	private String jobDescription;
	private String jobLocation;
	private int salary;
	private String jobtype;
	
	private int companyId;
	public JobListing(int jobId, String jobTitle, String jobDescription, String jobLocation, int salary, String jobtype, int companyId) {
		super();
		this.jobId = jobId;
		this.jobTitle = jobTitle;
		this.jobDescription = jobDescription;
		this.jobLocation = jobLocation;
		this.salary = salary;
		this.jobtype = jobtype;
		
		this.companyId = companyId;
	}
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	public String getJobLocation() {
		return jobLocation;
	}
	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getJobtype() {
		return jobtype;
	}
	public void setJobtype(String jobtype) {
		this.jobtype = jobtype;
	
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	@Override
	public String toString() {
		return "JobListing [jobId=" + jobId + ", jobTitle=" + jobTitle + ", jobDescription=" + jobDescription
				+ ", jobLocation=" + jobLocation + ", salary=" + salary + ", jobtype=" + jobtype 
				+  ", companyId=" + companyId + "]";
	}
	
	
	
	 
}
