package org.example.controller;

import org.example.dto.ProductDTO;
import org.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/store")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/product/{uniqId}")
    public ResponseEntity<ProductDTO> getAvailableProduct(@PathVariable Long uniqId) {
        ProductDTO availableProduct = productService.getAvailableProduct(uniqId);
        return ResponseEntity.status(HttpStatus.FOUND).body(availableProduct);
    }
}
