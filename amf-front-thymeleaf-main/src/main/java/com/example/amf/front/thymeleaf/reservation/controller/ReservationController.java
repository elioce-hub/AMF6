package com.example.amf.front.thymeleaf.reservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.amf.front.thymeleaf.reservation.service.ReservationService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@Controller
@RequestMapping("/reservation")
public class ReservationController {
	
	@Autowired
	ReservationService reservationService;
	
	@GetMapping("/list")
	public String getReservations(Model model) {
		
		model.addAttribute("reservations", reservationService.findAllReservations());
		return "reservation/list";
	}
//	@GetMapping("/list")
//	public String getReservations() {
////		model.addAttribute("reservations", reservationService.findAllReservations());
//		return "reservation/list";
//	}

}
