package edu.phukrit.learning.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.phukrit.learning.dtos.UserDto;
import edu.phukrit.learning.models.UserModel;
import edu.phukrit.learning.repositories.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserService() {
        // Default constructor
    }

    public List<UserDto> getAllUsersAsDto() {
        // Fetch all UserModel entities from the repository
        List<UserModel> userModels = userRepository.findAll();

        // Convert List<UserModel> to List<UserDto>
        List<UserDto> userDtos = userModels.stream()
                .map(user -> new UserDto(user.getId(), user.getFname(), user.getLname()))
                .collect(Collectors.toList());


        return userDtos;
    }

}
