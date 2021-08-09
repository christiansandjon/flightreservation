package com.smc.flightreservation.entity;

import com.smc.flightreservation.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserEntity extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}
