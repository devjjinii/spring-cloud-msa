package com.yujin.orderservice.service;

import com.yujin.orderservice.dto.OrderDto;
import com.yujin.orderservice.jpa.OrderEntity;

public interface OrderService {
    OrderDto createOrder(OrderDto orderDetails);
    OrderDto getOrderByOrderId(String orderId);
    Iterable<OrderEntity> getOrdersByUserId(String userId);
}
