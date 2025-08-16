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
        // 1. ไปเอาวัตถุดิบดิบ (UserModel) มาจากคลังเหมือนเดิม
        List<UserModel> userModels = userRepository.findAll();

        // 2. แปลงร่าง! (หัวใจสำคัญอยู่ตรงนี้)
        // เราจะวนลูป userModels ทีละตัว แล้วสร้าง UserDto ใหม่จากข้อมูลของมัน
        List<UserDto> userDtos = userModels.stream()
                .map(user -> new UserDto(user.getId(), user.getFname(), user.getLname()))
                .collect(Collectors.toList());

        // 3. คืนค่าเป็นอาหารที่จัดจานสวยงามแล้ว (UserDto)
        return userDtos;
    }

}
