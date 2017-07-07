package com.projectmanagement.CodeNinja.dao;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.projectmanagement.CodeNinja.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, String>{

	public Employee findByCustomerIdAndId(String customerId, String id);
	public List<Employee> findByCustomerId(String customerId);

}