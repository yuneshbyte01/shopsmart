package com.yuneshtimsina.shopsmart.repository;

import com.yuneshtimsina.shopsmart.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
