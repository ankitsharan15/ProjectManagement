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

	@Column(name="customer_id") 
	private String customerId;
	@Id
	@GeneratedValue(generator ="uuid")
	@GenericGenerator(name="uuid",strategy ="uuid2")
	@Column(name="id") 
	private String id;
	@Column(name = "name")
	private String name;
	@Column(name = "team_id")
	private String teamId;
	@Column(name = "project_lead_id")
	private String projectLeadId;
	@Column(name = "created_on")
	private Date createdOn;
	@Column(name = "estimated_completion_date")
	private Date estimatedCompletionDate;
	@Column(name = "status")
	private String status;
	
}
