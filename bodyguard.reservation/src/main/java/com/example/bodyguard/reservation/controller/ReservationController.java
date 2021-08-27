package com.example.bodyguard.reservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bodyguard.reservation.domain.reservation.entity.Reservation;
import com.example.bodyguard.reservation.service.ReservationService;


@RestController
@RequestMapping("/api/reservation")
public class ReservationController {
	
	@Autowired
    ReservationService reservationService;
	
	@GetMapping("/client/{clientId}")
	public List<Reservation> findAllReservationByClientId(@PathVariable Long clientId){
		return reservationService.findAllReservationByClientId(clientId);
	}
	
	@GetMapping("/bodyguard/{bodyguardId}")
	public List<Reservation> findAllReservationByBodyguardId(@PathVariable Long bodyguardId){
		return reservationService.findAllReservationByBodyguardId(bodyguardId);
	}
}
