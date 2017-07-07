package com.projectmanagement.CodeNinja.dto;

import java.util.List;

public class EmployeeTeamDTO {

	private List<EmployeeDTO> employeeList;
	private List<TeamDTO> teamsList;

	public List<EmployeeDTO> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<EmployeeDTO> employeeList) {
		this.employeeList = employeeList;
	}

	public List<TeamDTO> getTeamsList() {
		return teamsList;
	}

	public void setTeamsList(List<TeamDTO> teamsList) {
		this.teamsList = teamsList;
	}

	@Override
	public String toString() {
		return "EmployeeTeamDTO [employeeList=" + employeeList + ", teamsList=" + teamsList + "]";
	}

}
