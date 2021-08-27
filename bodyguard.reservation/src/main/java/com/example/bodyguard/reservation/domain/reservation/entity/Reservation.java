package com.example.bodyguard.reservation.domain.reservation.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.bodyguard.reservation.domain.reservation.enums.Location;
import com.example.bodyguard.reservation.domain.reservation.enums.ReservationStatus;
import com.example.bodyguard.reservation.domain.reservation.vo.Bodyguard;
import com.example.bodyguard.reservation.domain.reservation.vo.Client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "guard_start_date")
	private Date guard_start_date;
	
	@Column(name = "guard_end_date")
	private Date guard_end_date;
	
	@Column(name = "guard_location")
	@Enumerated(EnumType.STRING)
	private Location guard_location;
	
	@Column(name = "reservation_status")
	@Enumerated(EnumType.STRING)
	private ReservationStatus reservation_status;
	
	@Embedded
	private Client client;
	
	@Embedded
	private Bodyguard bodyguard;
	
}
