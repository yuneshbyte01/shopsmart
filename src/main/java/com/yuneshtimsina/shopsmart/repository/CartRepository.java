package com.yuneshtimsina.shopsmart.repository;

import com.yuneshtimsina.shopsmart.model.Cart;
import com.yuneshtimsina.shopsmart.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartRepository extends JpaRepository<Cart, Long> {
    Optional<Cart> findByUser(User user);
}
