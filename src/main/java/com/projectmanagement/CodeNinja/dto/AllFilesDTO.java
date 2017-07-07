package com.projectmanagement.CodeNinja.dto;

import java.util.List;

public class AllFilesDTO {

	private String fileName;
	private String fileUrl;
	private String reviewId;
	private String status;
	private List<BugDTO> bugList;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public String getReviewId() {
		return reviewId;
	}

	public void setReviewId(String reviewId) {
		this.reviewId = reviewId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<BugDTO> getBugList() {
		return bugList;
	}

	public void setBugList(List<BugDTO> bugList) {
		this.bugList = bugList;
	}

	@Override
	public String toString() {
		return "AllFilesDTO [fileName=" + fileName + ", fileUrl=" + fileUrl + ", reviewId=" + reviewId + ", status="
				+ status + ", bugList=" + bugList + "]";
	}

}
