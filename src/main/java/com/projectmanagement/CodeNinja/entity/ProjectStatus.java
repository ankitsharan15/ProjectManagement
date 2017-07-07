package com.projectmanagement.CodeNinja.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "project_status")
public class ProjectStatus {

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
	@Column(name = "project_id")
	private String projectId;
	@Column(name = "percent_complete")
	private float percentComplete;

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

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public float getPercentComplete() {
		return percentComplete;
	}

	public void setPercentComplete(float percentComplete) {
		this.percentComplete = percentComplete;
	}

	@Override
	public String toString() {
		return "ProjectStatus [customerId=" + customerId + ", id=" + id + ", name=" + name + ", teamId=" + teamId
				+ ", projectId=" + projectId + ", percentComplete=" + percentComplete + "]";
	}

}
