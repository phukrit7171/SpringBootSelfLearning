package edu.phukrit.learning.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import edu.phukrit.learning.dtos.UserDto;
import edu.phukrit.learning.models.UserModel;

// This tells MapStruct to generate an implementation of this interface
// and make it a Spring component, so we can inject it.
@Mapper(componentModel = "spring")
public interface UserMapper {

    // A convenient instance to access the mapper.
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    // Declares a method to map a UserModel entity to a UserDto.
    UserDto toUserDto(UserModel userModel);

    // MapStruct is smart enough to use the method above to map a list.
    List<UserDto> toUserDtoList(List<UserModel> userModels);
}