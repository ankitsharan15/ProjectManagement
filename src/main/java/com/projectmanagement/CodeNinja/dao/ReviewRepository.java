package com.projectmanagement.CodeNinja.dao;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.projectmanagement.CodeNinja.entity.Review;

public interface ReviewRepository extends CrudRepository<Review, String>{

	public Review findByCustomerIdAndId(String customerId, String id);
	public List<Review> findByCustomerIdAndProjectId(String customerId,String projectId);

}
