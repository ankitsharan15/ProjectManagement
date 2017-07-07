package com.projectmanagement.CodeNinja.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "project")
public class Project {

	@Column(name = "customer_id")
	private String customerId;
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(name = "id")
	private String id;
	@Column(name = "name")
	private String name;
	@Column(name = "team_id")
	private String teamId;
	@Column(name = "project_lead_id")
	private String projectLeadId;
	@Column(name = "repo_url")
	private String repoUrl;
	@Column(name = "created_on")
	private Date createdOn;
	@Column(name = "modified_on")
	private Date modifiedOn;
	@Column(name = "estimated_completion_date")
	private Date estimatedCompletionDate;
	@Column(name = "status")
	private String status;

	public String getRepoUrl() {
		return repoUrl;
	}

	public void setRepoUrl(String repoUrl) {
		this.repoUrl = repoUrl;
	}

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

	public String getTeamId() {
		return teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

	public String getProjectLeadId() {
		return projectLeadId;
	}

	public void setProjectLeadId(String projectLeadId) {
		this.projectLeadId = projectLeadId;
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

	public Date getEstimatedCompletionDate() {
		return estimatedCompletionDate;
	}

	public void setEstimatedCompletionDate(Date estimatedCompletionDate) {
		this.estimatedCompletionDate = estimatedCompletionDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Project [customerId=" + customerId + ", id=" + id + ", name=" + name + ", teamId=" + teamId
				+ ", projectLeadId=" + projectLeadId + ", repoUrl=" + repoUrl + ", createdOn=" + createdOn
				+ ", modifiedOn=" + modifiedOn + ", estimatedCompletionDate=" + estimatedCompletionDate + ", status="
				+ status + "]";
	}

}
