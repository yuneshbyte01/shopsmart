package com.yuneshtimsina.shopsmart.dto.Cart;

import lombok.Data;
import java.util.List;

@Data
public class CartResponseDto {
    private List<CartItemResponseDto> items;
}
