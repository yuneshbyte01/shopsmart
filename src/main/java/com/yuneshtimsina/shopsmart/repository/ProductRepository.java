package com.yuneshtimsina.shopsmart.repository;

import com.yuneshtimsina.shopsmart.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
