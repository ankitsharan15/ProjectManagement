package com.projectmanagement.CodeNinja.dao;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.projectmanagement.CodeNinja.entity.Bug;

public interface BugRepository extends CrudRepository<Bug, String>{

	public Bug findByCustomerIdAndId(String customerId, String id);
	public List<Bug> findByCustomerIdAndAssignedTo(String customerId, String assignedTo);
	public List<Bug> findByCustomerIdAndFileUrl(String customerId, String fileUrl);
	
}
