package com.projectmanagement.CodeNinja.dao;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.projectmanagement.CodeNinja.entity.Project;

public interface ProjectRepository extends CrudRepository<Project, String>{

	public Project findByCustomerIdAndId(String customerId, String id);
	public List<Project> findByCustomerId(String customerId);
}
