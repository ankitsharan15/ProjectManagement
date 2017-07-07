package com.projectmanagement.CodeNinja.dto;

public class CreateBugDTO {

	private String bugName;
	private String reviewId;
	private String bugCategoryId;
	private String fileUrl;
	private String lineNum;

	public String getBugName() {
		return bugName;
	}

	public void setBugName(String bugName) {
		this.bugName = bugName;
	}

	public String getReviewId() {
		return reviewId;
	}

	public void setReviewId(String reviewId) {
		this.reviewId = reviewId;
	}

	public String getBugCategoryId() {
		return bugCategoryId;
	}

	public void setBugCategoryId(String bugCategoryId) {
		this.bugCategoryId = bugCategoryId;
	}

	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public String getLineNum() {
		return lineNum;
	}

	public void setLineNum(String lineNum) {
		this.lineNum = lineNum;
	}

	@Override
	public String toString() {
		return "CreateBugDTO [bugName=" + bugName + ", reviewId=" + reviewId + ", bugCategoryId=" + bugCategoryId
				+ ", fileUrl=" + fileUrl + ", lineNum=" + lineNum + "]";
	}

}
