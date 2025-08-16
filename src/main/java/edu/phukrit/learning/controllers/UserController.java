package edu.phukrit.learning.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.phukrit.learning.dtos.UserDto;
import edu.phukrit.learning.services.UserService;


@RestController
@RequestMapping("/api/users")
public class UserController {
    
    @Autowired
    private UserService userService;

    public UserController() {
        // Default constructor
    }

    @GetMapping
    public List<UserDto> getAllUsers(){
        return userService.getAllUsersAsDto();
    }
    


}
