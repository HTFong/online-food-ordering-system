package com.foodordering.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CreateOrderDTO {
    private Long userId;
    private Long restaurantId;
    private List<OrderItemDTO> orderItems;
}
