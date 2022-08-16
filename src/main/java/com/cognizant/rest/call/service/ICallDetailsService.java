package com.cognizant.rest.call.service;

import java.util.List;

import com.cognizant.rest.call.model.CallDetails;

public interface ICallDetailsService {

	public List<CallDetails> fetchCallDetailsOf(Long fromNumber);
}
