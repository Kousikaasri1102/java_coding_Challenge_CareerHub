package com.model;



public class Application {
	private int id;
	private int jobId;
	private int applicantId;
	
	private String coverLetter;
	public Application(int id, int jobId, int applicantId, String coverLetter) {
		super();
		this.id = id;
		this.jobId = jobId;
		this.applicantId = applicantId;
		
		this.coverLetter = coverLetter;
	}
	public Application(int id, int jobId, String coverLetter) {
		super();
		this.id = id;
		this.jobId = jobId;
		this.coverLetter = coverLetter;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public int getApplicantId() {
		return applicantId;
	}
	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}
	
	
	public String getCoverLetter() {
		return coverLetter;
	}
	public void setCoverLetter(String coverLetter) {
		this.coverLetter = coverLetter;
	}
	@Override
	public String toString() {
		return "Application [id=" + id + ", jobId=" + jobId + ", applicantId=" + applicantId + 
				 ", coverLetter=" + coverLetter + "]";
	}
	
	
}
