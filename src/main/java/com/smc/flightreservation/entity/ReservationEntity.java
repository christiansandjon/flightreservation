package com.smc.flightreservation.entity;

import com.smc.flightreservation.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationEntity extends JpaRepository<Reservation, Long> {
}
