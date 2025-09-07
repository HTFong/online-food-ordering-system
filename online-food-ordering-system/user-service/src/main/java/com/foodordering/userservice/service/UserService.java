package com.foodordering.userservice.service;

import com.foodordering.userservice.dto.UserResponseDTO;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    UserResponseDTO getUserById(Long id);
}
