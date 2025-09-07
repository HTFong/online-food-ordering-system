package com.foodordering.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderItemDTO {
    private Long menuItemId;
    private Integer quantity;
    private BigDecimal price;
}
