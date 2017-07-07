package com.projectmanagement.CodeNinja.dto;

import java.util.Date;

public class AllProjectsDTO {

	private String projectName;
	private String projectId;
	private String teamLeadId;
	private String teamLeadName;
	private String status;
	private Date completionDate;

	public Date getCompletionDate() {
		return completionDate;
	}

	public void setCompletionDate(Date completionDate) {
		this.completionDate = completionDate;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getTeamLeadId() {
		return teamLeadId;
	}
	public void setTeamLeadId(String teamLeadId) {
		this.teamLeadId = teamLeadId;
	}
	public String getTeamLeadName() {
		return teamLeadName;
	}
	public void setTeamLeadName(String teamLeadName) {
		this.teamLeadName = teamLeadName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "AllProjectsDTO [projectName=" + projectName + ", projectId=" + projectId + ", teamLeadId=" + teamLeadId
				+ ", teamLeadName=" + teamLeadName + ", status=" + status + ", completionDate=" + completionDate + "]";
	}

}
