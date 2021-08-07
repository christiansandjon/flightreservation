package com.smc.flightreservation.entity;

import com.smc.flightreservation.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightEntity extends JpaRepository<Flight, Long> {
}
