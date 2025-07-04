package com.yuneshtimsina.shopsmart.dto.Cart;

import lombok.Data;

@Data
public class CartItemResponseDto {
    private Long id;
    private Long productId;
    private String productName;
    private Double price;
    private Integer quantity;
}
