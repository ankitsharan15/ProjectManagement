package com.projectmanagement.CodeNinja.dto;

import java.util.Date;

public class SaveProjectDTO {

	private String projectId;
	private String projectName;
	private String repoUrl;
	private String teamLeadId;
	private Date completionDate;

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
		return "SaveProjectDTO [projectId=" + projectId + ", projectName=" + projectName + ", repoUrl=" + repoUrl
				+ ", teamLeadId=" + teamLeadId + ", completionDate=" + completionDate + "]";
	}

}
