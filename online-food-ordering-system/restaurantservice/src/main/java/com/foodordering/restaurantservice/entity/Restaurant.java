package com.foodordering.restaurantservice.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
@Data
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String note;

    private String status; // OPEN/CLOSED

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdAt;

    private Long userId;
}
