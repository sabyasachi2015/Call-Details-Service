package com.cognizant.rest.call.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.rest.call.model.CallDetails;
import com.cognizant.rest.call.service.ICallDetailsService;

@RestController
@RequestMapping("/api/v1/call")
public class CallDetailsRestController {
	
	@Autowired
	private ICallDetailsService callDetailsService;
	
	@GetMapping("/callDetails/{fromNumber}")
	public ResponseEntity<? extends Object> getAllCallDetails(@PathVariable Long fromNumber){
		//Call service layer
		List<CallDetails> listCallDetails = callDetailsService.fetchCallDetailsOf(fromNumber);
		
		 if(null !=listCallDetails && !listCallDetails.isEmpty()) {
			 return new ResponseEntity<List<CallDetails>>(listCallDetails, HttpStatus.OK);			 
		 }else {
			 return new ResponseEntity<Object>("No calldetails were found for:"+fromNumber, HttpStatus.BAD_REQUEST); 
		 }
	}
}
