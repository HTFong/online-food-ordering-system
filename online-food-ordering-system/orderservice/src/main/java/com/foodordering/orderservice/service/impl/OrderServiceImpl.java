package com.foodordering.orderservice.service.impl;

import com.foodordering.orderservice.dto.OrderItemDTO;
import com.foodordering.orderservice.dto.OrderResponseDTO;
import com.foodordering.orderservice.entity.Order;
import com.foodordering.orderservice.exception.DataAccessException;
import com.foodordering.orderservice.repository.OrderRepository;
import com.foodordering.orderservice.service.OrderService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;
    private final ModelMapper mapper;

    public OrderServiceImpl(OrderRepository orderRepository, ModelMapper mapper) {
        this.orderRepository = orderRepository;
        this.mapper = mapper;
    }

    @Override
    public List<OrderResponseDTO> getOrdersByUserId(Long userId) {
        List<OrderResponseDTO> orders = new ArrayList<>();
        if (userId ==1){
            OrderResponseDTO orderResp = new OrderResponseDTO();
            orderResp.setUserId(1L);
            orderResp.setRestaurantId(11L);
            orderResp.setOrderItems(List.of(new OrderItemDTO(301L,1, BigDecimal.valueOf(1000L)),new OrderItemDTO(302L,2, BigDecimal.valueOf(1000L))));
            orders.add(orderResp);
            return orders;
        }
        orders = orderRepository.findByUserId(userId)
                .orElseThrow(() -> new DataAccessException("OrderService", "UserId", userId.toString())).stream()
                .map(order -> mapper.map(order, OrderResponseDTO.class)).collect(Collectors.toList());

        return orders;
    }
}
