package com.smc.flightreservation.entity;

import com.smc.flightreservation.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserEntity extends JpaRepository<User, Long> {
}
