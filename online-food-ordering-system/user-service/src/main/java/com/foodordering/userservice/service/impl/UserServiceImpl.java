package com.foodordering.userservice.service.impl;

import com.foodordering.userservice.dto.UserResponseDTO;
import com.foodordering.userservice.exception.UserNotFoundException;
import com.foodordering.userservice.repository.UserRepository;
import com.foodordering.userservice.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final ModelMapper mapper;

    public UserServiceImpl(UserRepository userRepository, ModelMapper mapper) {
        this.userRepository = userRepository;
        this.mapper = mapper;
    }

    @Override
    public UserResponseDTO getUserById(Long id) {
        if (id ==1) return new UserResponseDTO(id,"Mock-name","Mock-email");
        return mapper.map(userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("UserService", "UserId", id.toString())),UserResponseDTO.class);
    }
}
