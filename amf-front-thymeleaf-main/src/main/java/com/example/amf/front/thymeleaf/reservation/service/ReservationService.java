package com.example.amf.front.thymeleaf.reservation.service;

import java.util.List;

import com.example.amf.front.thymeleaf.reservation.dto.ReservationDto;

public interface ReservationService {
	List<ReservationDto> findAllReservations();
}
