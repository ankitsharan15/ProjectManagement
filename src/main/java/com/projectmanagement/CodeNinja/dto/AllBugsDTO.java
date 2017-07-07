package com.projectmanagement.CodeNinja.dto;

public class AllBugsDTO {

	private String bugId;
	private String bugName;
	private String projectName;
	private String projectId;
	private float severity;

	public String getBugId() {
		return bugId;
	}

	public void setBugId(String bugId) {
		this.bugId = bugId;
	}

	public String getBugName() {
		return bugName;
	}

	public void setBugName(String bugName) {
		this.bugName = bugName;
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

	public float getSeverity() {
		return severity;
	}

	public void setSeverity(float severity) {
		this.severity = severity;
	}

	@Override
	public String toString() {
		return "AllBugsDTO [bugId=" + bugId + ", bugName=" + bugName + ", projectName=" + projectName + ", projectId="
				+ projectId + ", severity=" + severity + "]";
	}

}
