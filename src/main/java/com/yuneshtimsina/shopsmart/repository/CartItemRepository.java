package com.yuneshtimsina.shopsmart.repository;

import com.yuneshtimsina.shopsmart.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}
