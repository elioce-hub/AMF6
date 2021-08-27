package com.example.amf.front.thymeleaf.reservation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.amf.front.thymeleaf.reservation.client.ReservationClient;
import com.example.amf.front.thymeleaf.reservation.dto.ReservationDto;
import com.example.amf.front.thymeleaf.reservation.service.ReservationService;

@Service
public class ReservationServiceImpl implements ReservationService{

	@Autowired
	ReservationClient reservationClient;
	
	@Override
	public List<ReservationDto> findAllReservations() {		
		System.out.println(reservationClient.getReservations());
		return null;
	}

}
