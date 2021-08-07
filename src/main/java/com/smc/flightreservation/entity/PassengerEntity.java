package com.smc.flightreservation.entity;

import com.smc.flightreservation.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerEntity extends JpaRepository<Passenger, Long> {
}
