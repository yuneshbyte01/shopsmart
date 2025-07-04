package com.yuneshtimsina.shopsmart.repository;

import com.yuneshtimsina.shopsmart.model.Order;
import com.yuneshtimsina.shopsmart.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUser(User user);
}
