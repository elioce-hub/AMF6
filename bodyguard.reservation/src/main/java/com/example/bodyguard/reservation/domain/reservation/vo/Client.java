package com.example.bodyguard.reservation.domain.reservation.vo;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Client {

	@Column(name = "client_id")
	private Long client_id;
	
	@Column(name = "client_name")
	private String client_name;
	
	@Column(name = "client_mobile_no")
	private Long client_mobile_no;
	
}
