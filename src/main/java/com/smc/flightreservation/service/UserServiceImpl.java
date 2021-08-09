package com.smc.flightreservation.service;

import com.smc.flightreservation.entity.UserEntity;
import com.smc.flightreservation.model.User;
import com.smc.flightreservation.service.interfaces.UserService;
import com.smc.flightreservation.util.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private UserEntity userEntity;

    @Autowired
    public UserServiceImpl(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    @Override
    public Optional<User> addUser(User user) {
        userEntity.save(user);
        return Optional.of(user);
    }

    @Override
    public Optional<User> updateUser(User user) {
        userEntity.save(user);
        return Optional.of(user);
    }

    @Override
    public void deleteUser(User user) {
        userEntity.delete(user);
    }

    @Override
    public void deleteUserById(Long id) {
        userEntity.deleteById(id);
    }

    @Override
    public List<User> findAllUser() {
        return (List<User>) userEntity.findAll();
    }

    @Override
    public Optional<User> findUserById(Long id) {
        return Optional.ofNullable(userEntity.findById(id).orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found")));
    }

    @Override
    public Optional<User> findUserByEmail(String email) {
        return Optional.ofNullable(userEntity.findByEmail(email).orElseThrow(() -> new UserNotFoundException("User by email " + email + " was not found")));
    }
}
