package com.projectmanagement.CodeNinja.dto;

public class BugDTO {

	private String bugId;
	private String bugName;

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

	@Override
	public String toString() {
		return "BugDTO [bugId=" + bugId + ", bugName=" + bugName + "]";
	}

}
