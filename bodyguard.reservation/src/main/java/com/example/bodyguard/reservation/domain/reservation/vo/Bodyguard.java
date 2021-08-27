package com.example.bodyguard.reservation.domain.reservation.vo;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.example.bodyguard.reservation.domain.reservation.enums.Gender;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Bodyguard {
	
	@Column(name = "bodyguard_id")
	private Long   bodyguard_id;
	
	@Column(name = "bodyguard_name")
	private String bodyguard_name;
	
	@Column(name = "bodyguard_mobile_no")
	private Long   bodyguard_mobile_no;
	
	@Column(name = "bodyguard_gender")
	@Enumerated(EnumType.STRING)
	private Gender bodyguard_gender;
	
}
