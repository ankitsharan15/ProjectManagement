package com.projectmanagement.CodeNinja.dto;

import java.util.Date;

public class SaveProjectDTO {

	private String customerId;
	private String projectId;
	private String projectName;
	private String repoUrl;
	private String teamLeadId;
	private Date completionDate;
	private String type;
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getRepoUrl() {
		return repoUrl;
	}

	public void setRepoUrl(String repoUrl) {
		this.repoUrl = repoUrl;
	}

	public String getTeamLeadId() {
		return teamLeadId;
	}

	public void setTeamLeadId(String teamLeadId) {
		this.teamLeadId = teamLeadId;
	}

	public Date getCompletionDate() {
		return completionDate;
	}

	public void setCompletionDate(Date completionDate) {
		this.completionDate = completionDate;
	}

	@Override
	public String toString() {
		return "SaveProjectDTO [customerId=" + customerId + ", projectId=" + projectId + ", projectName=" + projectName
				+ ", repoUrl=" + repoUrl + ", teamLeadId=" + teamLeadId + ", completionDate=" + completionDate
				+ ", type=" + type + ", status=" + status + "]";
	}

}
