package com.yuneshtimsina.shopsmart.dto.Order;

import lombok.Data;

@Data
public class OrderItemDto {
    private Long productId;
    private String productName;
    private Integer quantity;
    private Double priceAtPurchase;
}
