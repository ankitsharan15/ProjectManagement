package com.projectmanagement.CodeNinja.dto;

public class CreateBugDTO {

	private String customerId;
	private String bugName;
	private String reviewId;
	private String bugDesc;
	private String bugCategoryId;
	private String fileUrl;
	private int lineNum;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getBugDesc() {
		return bugDesc;
	}

	public void setBugDesc(String bugDesc) {
		this.bugDesc = bugDesc;
	}

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

	public int getLineNum() {
		return lineNum;
	}

	public void setLineNum(int lineNum) {
		this.lineNum = lineNum;
	}

	@Override
	public String toString() {
		return "CreateBugDTO [customerId=" + customerId + ", bugName=" + bugName + ", reviewId=" + reviewId
				+ ", bugDesc=" + bugDesc + ", bugCategoryId=" + bugCategoryId + ", fileUrl=" + fileUrl + ", lineNum="
				+ lineNum + "]";
	}

}
