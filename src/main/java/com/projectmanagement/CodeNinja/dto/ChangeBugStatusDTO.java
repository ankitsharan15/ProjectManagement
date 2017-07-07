package com.projectmanagement.CodeNinja.dto;

public class ChangeBugStatusDTO {

	private String customerId;
	private String bugId;
	private String status;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getBugId() {
		return bugId;
	}

	public void setBugId(String bugId) {
		this.bugId = bugId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ChangeBugStatusDTO [customerId=" + customerId + ", bugId=" + bugId + ", status=" + status + "]";
	}

}
