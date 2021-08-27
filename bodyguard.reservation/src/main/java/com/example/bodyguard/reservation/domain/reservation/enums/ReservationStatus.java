package com.example.bodyguard.reservation.domain.reservation.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ReservationStatus {
	Reserved,
	Reservation_confirmed,
	Canceled
}
