package com.example.amf.front.thymeleaf.reservation.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationDto {
	private Long id;
	private Date startDate;
	private Date endDate;
	private String status;
	private String bodyguardName;
	private String bodyguardGender;
	private String bodyguardMobile;
}
