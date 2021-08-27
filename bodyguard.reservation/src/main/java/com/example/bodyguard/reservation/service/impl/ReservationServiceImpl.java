package com.example.bodyguard.reservation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bodyguard.reservation.domain.reservation.entity.Reservation;
import com.example.bodyguard.reservation.domain.reservation.repository.ReservationRepository;
import com.example.bodyguard.reservation.domain.reservation.vo.Bodyguard;
import com.example.bodyguard.reservation.domain.reservation.vo.Client;
import com.example.bodyguard.reservation.service.ReservationService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	ReservationRepository reservationRepository;
	
	@Override
	public List<Reservation> findAllReservationByClientId(Long id) {
		Client client = new Client();
		client.setClient_id(id);
		return reservationRepository.findAllByClient(client);
	}

	@Override
	public List<Reservation> findAllReservationByBodyguardId(Long id) {
		Bodyguard bodyguard = new Bodyguard();
		bodyguard.setBodyguard_id(id);
		return reservationRepository.findAllByBodyguard(bodyguard);
	}
}
