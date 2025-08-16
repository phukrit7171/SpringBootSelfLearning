package edu.phukrit.learning.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.phukrit.learning.models.UserModel;
import edu.phukrit.learning.repositories.UserRepository;  

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserService() {
        // Default constructor
    }
    public List<UserModel> getAllUsers() {
        return userRepository.findAll();
    }

}
 
