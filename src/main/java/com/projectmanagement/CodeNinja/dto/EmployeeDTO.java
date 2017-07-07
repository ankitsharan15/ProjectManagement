package com.projectmanagement.CodeNinja.dto;

public class EmployeeDTO {

	private String employeeId;
	private String employeeName;

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public String toString() {
		return "EmployeDTO [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}

}
