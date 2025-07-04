package com.yuneshtimsina.shopsmart.dto.Product;

import lombok.Data;

@Data
public class ProductCreateUpdateDto {
    private String name;
    private String description;
    private String category;
    private Double price;
    private String imageUrl;
    private Integer stockQuantity;
}
