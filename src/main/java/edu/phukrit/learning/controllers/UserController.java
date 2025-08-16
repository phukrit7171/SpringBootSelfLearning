package edu.phukrit.learning.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.phukrit.learning.models.UserModel;
import edu.phukrit.learning.repositories.UserRepository;
import edu.phukrit.learning.dtos.UserDto;

@RestController
@RequestMapping("/api/users")
public class UserController {
    
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<UserModel> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public UserModel getUserById(@PathVariable Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @PostMapping
    public UserModel createUser(@RequestBody UserDto user) {
        UserModel newUser = new UserModel(user.getFname(), user.getLname());
        return userRepository.save(newUser);
    }
}
