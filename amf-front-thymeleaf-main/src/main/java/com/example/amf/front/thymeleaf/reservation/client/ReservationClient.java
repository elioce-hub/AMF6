package com.example.amf.front.thymeleaf.reservation.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.amf.front.thymeleaf.reservation.dto.ReservationDto;

import feign.Response;

@FeignClient(name="reservationClient", url="http://localhost:8080")
public interface ReservationClient {
	@GetMapping("/reservations")
	Response getReservations();
}