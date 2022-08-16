package com.cognizant.rest.call.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.rest.call.entity.CallDetailsEntity;

public interface CallDetailsRepository extends JpaRepository<CallDetailsEntity, Integer> {
	
	List<CallDetailsEntity> findByFromNumber(Long fromNumber);

}
