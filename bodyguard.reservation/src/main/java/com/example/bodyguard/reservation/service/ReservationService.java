package com.example.bodyguard.reservation.service;

import java.util.List;

import com.example.bodyguard.reservation.domain.reservation.entity.Reservation;

public interface ReservationService {
	List<Reservation> findAllReservationByClientId(Long id);
	List<Reservation> findAllReservationByBodyguardId(Long id);
}
