package edu.phukrit.learning.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.phukrit.learning.dtos.UserDto;
import edu.phukrit.learning.mappers.UserMapper; // 1. Import our new mapper
import edu.phukrit.learning.models.UserModel;
import edu.phukrit.learning.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper; // 2. Inject the mapper bean

    public List<UserDto> getAllUsersAsDto() {
        // 3. Fetch the raw entity data from the database
        List<UserModel> userModels = userRepository.findAll();

        // 4. Use the mapper to convert the list of entities to a list of DTOs in one line!
        return userMapper.toUserDtoList(userModels);
    }
}