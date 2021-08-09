package com.smc.flightreservation.service.interfaces;

import com.smc.flightreservation.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {

    Optional<User> addUser(User user);
    Optional<User> updateUser(User user);
    void deleteUser(User user);
    void deleteUserById(Long id);
    List<User> findAllUser();
    Optional<User> findUserById(Long id);
    Optional<User> findUserByEmail(String email);
}
