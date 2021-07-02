package com.barber.Barberapi.service.user.impl;

import com.barber.Barberapi.document.user.User;
import com.barber.Barberapi.dto.UserDTO;
import com.barber.Barberapi.exception.ExceptionPerNullUser;
import com.barber.Barberapi.repository.user.UserRepository;
import com.barber.Barberapi.service.user.AbstractUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Optional.*;

@Service
public class UserService implements AbstractUserService<UserDTO> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserDTO> findUsers() {
        List<User> users = userRepository.findAll();
        return convertToListUserDTO(users);
    }

    @Override
    public List<UserDTO> convertToListUserDTO(List<User> users) {
        return users.stream().map(UserDTO::new).collect(Collectors.toList());
    }

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        checkIfItIsNotNull(ofNullable(userDTO));
        userRepository.save(convertToUser(userDTO));
        return userDTO;
    }

    @Override
    public User convertToUser(UserDTO dto) {
        return User.builder()
                .userId(dto.getUserId())
                .userName(dto.getUserName())
                .avatar(dto.getAvatar())
                .email(dto.getEmail())
                .password(dto.getPassword())
                .build();
    }

    @Override
    public UserDTO convertToUserDTO(User user) {
        return UserDTO.builder()
                .userId(user.getUserId())
                .userName(user.getUserName())
                .avatar(user.getAvatar())
                .email(user.getEmail())
                .password(user.getPassword())
                .build();
    }

    @Override
    public void checkIfUserAlreadyExists(UserDTO dto) {

    }

    @Override
    public void checkIfItIsNotNull(Optional<UserDTO> dto) {
        if(!dto.isPresent())
            throw new ExceptionPerNullUser(dto);
    }

    @Override
    public UserDTO updateUser(String userId, UserDTO dto) {
        return null;
    }

    @Override
    public void deleteUserById(String UserId) {

    }
}
