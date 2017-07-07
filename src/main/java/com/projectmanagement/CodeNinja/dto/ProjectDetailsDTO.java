package com.projectmanagement.CodeNinja.dto;

public class ProjectDetailsDTO {
	
	private String projectName;
	private String teamName;
	private String projectLeadName;
	private String repoUrl;
	
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getProjectLeadName() {
		return projectLeadName;
	}
	public void setProjectLeadName(String projectLeadName) {
		this.projectLeadName = projectLeadName;
	}
	public String getRepoUrl() {
		return repoUrl;
	}
	public void setRepoUrl(String repo_url) {
		this.repoUrl = repo_url;
	}
	@Override
	public String toString() {
		return "ProjectDetailsDTO [projectName=" + projectName + ", teamName=" + teamName + ", projectLeadName="
				+ projectLeadName + ", repo_url=" + repoUrl + "]";
	}
	
	

}