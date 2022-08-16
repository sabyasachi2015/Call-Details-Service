package com.cognizant.rest.call.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.rest.call.entity.CallDetailsEntity;
import com.cognizant.rest.call.model.CallDetails;
import com.cognizant.rest.call.repository.CallDetailsRepository;
import com.cognizant.rest.call.service.ICallDetailsService;

@Service
public class CallDetailsServiceImpl implements ICallDetailsService {
	
	@Autowired
	private CallDetailsRepository CallDetailsRepository;

	@Override
	public List<CallDetails> fetchCallDetailsOf(Long fromNumber) {

		// Call repository layer
		List<CallDetailsEntity> listCallDetailsEntity = CallDetailsRepository.findByFromNumber(fromNumber);

		List<CallDetails> listCallDetailsDto = new ArrayList<>();
		
		listCallDetailsEntity.forEach(callDetailsEntity -> {
			// convert entity to dto
			CallDetails callDetailsDto = new CallDetails();
			BeanUtils.copyProperties(callDetailsEntity, callDetailsDto);
			listCallDetailsDto.add(callDetailsDto);
		});

		return listCallDetailsDto;
	}
}
