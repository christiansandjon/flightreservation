package com.smc.flightreservation.controller;

import com.smc.flightreservation.model.User;
import com.smc.flightreservation.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String login(@ModelAttribute("user") User user) {
        userService.addUser(user);
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam("email") String email,@RequestParam("password") String password, ModelMap modelmap) {
        Optional<User> user = userService.findUserByEmail(email);
        if (user.get().getPassword().equals(password)) {
            return "findFlights";
        } else {
           modelmap.addAttribute("msg", "invalid user name or password. Please try again.");
        }
        return "login/login";
    }
}
