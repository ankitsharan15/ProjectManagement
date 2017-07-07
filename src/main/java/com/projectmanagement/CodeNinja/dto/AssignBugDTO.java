package com.projectmanagement.CodeNinja.dto;

public class AssignBugDTO {

	private String bugId;
	private String customerId;
	private String assignedToId;

	public String getBugId() {
		return bugId;
	}

	public void setBugId(String bugId) {
		this.bugId = bugId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getAssignedToId() {
		return assignedToId;
	}

	public void setAssignedToId(String assignedToId) {
		this.assignedToId = assignedToId;
	}

	@Override
	public String toString() {
		return "AssignBugDTO [bugId=" + bugId + ", customerId=" + customerId + ", assignedToId=" + assignedToId + "]";
	}

}
