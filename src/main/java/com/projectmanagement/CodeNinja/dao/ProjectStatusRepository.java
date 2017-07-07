package com.projectmanagement.CodeNinja.dao;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.projectmanagement.CodeNinja.entity.ProjectStatus;

public interface ProjectStatusRepository extends CrudRepository<ProjectStatus, String>{

	public ProjectStatus findByCustomerIdAndId(String customerId, String id);
	public List<ProjectStatus> findByCustomerId(String customerId);

}
