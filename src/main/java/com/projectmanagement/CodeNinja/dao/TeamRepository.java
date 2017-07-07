package com.projectmanagement.CodeNinja.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.projectmanagement.CodeNinja.entity.Team;

public interface TeamRepository extends CrudRepository<Team, String>{

	public Team findByCustomerIdAndId(String customerId, String id);
	public List<Team> findByCustomerId(String customerId);
}
