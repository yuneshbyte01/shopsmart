package com.yuneshtimsina.shopsmart.dto.Order;

import lombok.Data;
import java.util.List;

@Data
public class OrderDto {
    private Long id;
    private String orderDate;
    private Double totalAmount;
    private List<OrderItemDto> items;
}
