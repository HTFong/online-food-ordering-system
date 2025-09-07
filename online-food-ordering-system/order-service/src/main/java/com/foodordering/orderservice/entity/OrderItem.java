package com.foodordering.orderservice.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long menuItemId;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
}
