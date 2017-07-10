package com.projectmanagement.CodeNinja.dto;

import java.util.Date;
import java.util.List;

public class EditProjectDTO {

	private String projectId;
	private String projectName;
	private String teamId;
	private String teamName;
	private String repoUrl;
	private String teamLeadId;
	private String teamLeadName;
	private Date completionDate;
	private EmployeeTeamDTO employeeTeamDTO;

	public EmployeeTeamDTO getEmployeeTeamDTO() {
		return employeeTeamDTO;
	}

	public void setEmployeeTeamDTO(EmployeeTeamDTO employeeTeamDTO) {
		this.employeeTeamDTO = employeeTeamDTO;
	}

	public Date getCompletionDate() {
		return completionDate;
	}

	public void setCompletionDate(Date completionDate) {
		this.completionDate = completionDate;
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

	public String getTeamId() {
		return teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
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

	public String getTeamLeadName() {
		return teamLeadName;
	}

	public void setTeamLeadName(String teamLeadName) {
		this.teamLeadName = teamLeadName;
	}

	@Override
	public String toString() {
		return "EditProjectDTO [projectId=" + projectId + ", projectName=" + projectName + ", teamId=" + teamId
				+ ", teamName=" + teamName + ", repoUrl=" + repoUrl + ", teamLeadId=" + teamLeadId + ", teamLeadName="
				+ teamLeadName + ", completionDate=" + completionDate + ", employeeTeamDTO=" + employeeTeamDTO + "]";
	}

}
