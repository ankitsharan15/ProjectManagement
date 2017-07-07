package com.projectmanagement.CodeNinja.dto;

public class BugCategoryDTO {

	private String bugCategoryId;
	private String bugCategoryName;

	public String getBugCategoryId() {
		return bugCategoryId;
	}

	public void setBugCategoryId(String bugCategoryId) {
		this.bugCategoryId = bugCategoryId;
	}

	public String getBugCategoryName() {
		return bugCategoryName;
	}

	public void setBugCategoryName(String bugCategoryName) {
		this.bugCategoryName = bugCategoryName;
	}

	@Override
	public String toString() {
		return "BugCategoryDTO [bugCategoryId=" + bugCategoryId + ", bugCategoryName=" + bugCategoryName + "]";
	}

}
