package com.foodordering.userservice.dto;

import lombok.Data;

@Data
public class UserRegistrationDTO {
    private String email;
    private String password;
}