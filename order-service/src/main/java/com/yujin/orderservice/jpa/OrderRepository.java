package com.yujin.orderservice.jpa;

import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<OrderEntity, Long> {
    OrderEntity findOrderId(String orderId);
    Iterable<OrderEntity> findByUserId(String userId);
}
