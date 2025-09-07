package com.foodordering.restaurantservice.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RestaurantDTO {
    private Long id;

    private String name;

    private String note;

    private String status; // OPEN/CLOSED

    private LocalDateTime createdAt;

    private Long userId;
}
