package com.example.bodyguard.reservation.domain.reservation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bodyguard.reservation.domain.reservation.entity.Reservation;
import com.example.bodyguard.reservation.domain.reservation.vo.Bodyguard;
import com.example.bodyguard.reservation.domain.reservation.vo.Client;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long>{
	
	List<Reservation> findAllByClient(Client client);
	List<Reservation> findAllByBodyguard(Bodyguard bodyguard);
}
