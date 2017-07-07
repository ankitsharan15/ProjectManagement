package com.projectmanagement.CodeNinja.dao;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.projectmanagement.CodeNinja.entity.BugCategory;

public interface BugCategoryRepository extends CrudRepository<BugCategory, String> {

	public BugCategory findByCustomerIdAndId(String customerId, String Id);
	public List<BugCategory> findByCustomerId(String customerId);
	
}
