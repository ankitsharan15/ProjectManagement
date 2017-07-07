package com.projectmanagement.CodeNinja.dto;

public class FileUploadDTO {

	private String customerId;
	private String fileName;
	private String fileUrl;
	private String projectId;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

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

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	@Override
	public String toString() {
		return "FileUploadDTO [customerId=" + customerId + ", fileName=" + fileName + ", fileUrl=" + fileUrl
				+ ", projectId=" + projectId + "]";
	}

}
