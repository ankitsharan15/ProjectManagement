package com.projectmanagement.CodeNinja.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "bug")
public class Bug {

	@Column(name = "customer_id")
	private String customerId;
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(name = "id")
	private String id;
	@Column(name = "name")
	private String name;
	@Column(name = "project_id")
	private String projectId;
	@Column(name = "team_id")
	private String teamId;
	@Column(name = "category_id")
	private String categoryId;
	@Column(name = "bug_desc")
	private String bugDesc;
	@Column(name = "assigned_to")
	private String assignedTo;
	@Column(name = "assigned_by")
	private String assignedBy;
	@Column(name = "file_url")
	private String fileUrl;
	@Column(name = "line_num")
	private int lineNum;
	@Column(name = "status")
	private String status;
	@Column(name = "created_on")
	private Date createdOn;
	@Column(name = "modified_on")
	private Date modifiedOn;
	@Column(name = "completion_date")
	private Date completionDate;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getTeamId() {
		return teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getBugDesc() {
		return bugDesc;
	}

	public void setBugDesc(String bugDesc) {
		this.bugDesc = bugDesc;
	}

	public String getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	public String getAssignedBy() {
		return assignedBy;
	}

	public void setAssignedBy(String assignedBy) {
		this.assignedBy = assignedBy;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public Date getCompletionDate() {
		return completionDate;
	}

	public void setCompletionDate(Date completionDate) {
		this.completionDate = completionDate;
	}

	@Override
	public String toString() {
		return "Bug [customerId=" + customerId + ", id=" + id + ", name=" + name + ", projectId=" + projectId
				+ ", teamId=" + teamId + ", categoryId=" + categoryId + ", bugDesc=" + bugDesc + ", assignedTo="
				+ assignedTo + ", assignedBy=" + assignedBy + ", fileUrl=" + fileUrl + ", lineNum=" + lineNum
				+ ", status=" + status + ", createdOn=" + createdOn + ", modifiedOn=" + modifiedOn + ", completionDate="
				+ completionDate + "]";
	}

}
