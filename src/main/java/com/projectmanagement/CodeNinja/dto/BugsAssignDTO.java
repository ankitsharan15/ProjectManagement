package com.projectmanagement.CodeNinja.dto;

import java.util.List;

public class BugsAssignDTO {

	private String bugId;
	private String bugName;
	private String projectName;
	private List<EmployeeDTO> employeeList;

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

	public List<EmployeeDTO> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<EmployeeDTO> employeeList) {
		this.employeeList = employeeList;
	}

	@Override
	public String toString() {
		return "BugsAssignDTO [bugId=" + bugId + ", bugName=" + bugName + ", projectName=" + projectName
				+ ", employeeList=" + employeeList + "]";
	}

}
