package com.cognizant.rest.call.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class CallDetails implements Serializable {

	private static final long serialVersionUID = 1L;
	
    private Integer id;
	
	private Long fromNumber;
	
	private Long toNumber;
	
	private Integer duration;
	
	private LocalDateTime calledOn;

}
