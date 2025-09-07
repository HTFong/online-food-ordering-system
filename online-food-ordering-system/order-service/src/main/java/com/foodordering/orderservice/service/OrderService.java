package com.foodordering.orderservice.service;

import com.foodordering.orderservice.dto.OrderResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {
    List<OrderResponseDTO> getOrdersByUserId(Long userId);
}
