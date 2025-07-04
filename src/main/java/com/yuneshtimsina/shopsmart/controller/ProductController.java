package com.yuneshtimsina.shopsmart.controller;

import com.yuneshtimsina.shopsmart.dto.Product.ProductCreateUpdateDto;
import com.yuneshtimsina.shopsmart.dto.Product.ProductDto;
import com.yuneshtimsina.shopsmart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    // Publicly accessible
    @GetMapping
    public List<ProductDto> getAllProducts() {
        return productService.getAllProducts();
    }

    // Publicly accessible
    @GetMapping("/{id}")
    public ProductDto getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    // Admin only
    @PreAuthorize("hasAuthority('ADMIN')")
    @PostMapping
    public ProductDto createProduct(@RequestBody ProductCreateUpdateDto dto) {
        return productService.createProduct(dto);
    }

    // Admin only
    @PreAuthorize("hasAuthority('ADMIN')")
    @PutMapping("/{id}")
    public ProductDto updateProduct(@PathVariable Long id, @RequestBody ProductCreateUpdateDto dto) {
        return productService.updateProduct(id, dto);
    }

    // Admin only
    @PreAuthorize("hasAuthority('ADMIN')")
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }
}
