package com.cognizant.rest.call.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "CALL_DETAILS_TAB")
public class CallDetailsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private Long fromNumber;

	private Long toNumber;

	private Integer duration;

	private LocalDateTime calledOn;

}
