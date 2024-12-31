package org.example.controller;

import org.example.domain.Product;
import org.example.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("catalog")
public class CatalogController {
    @Autowired
    private CatalogService catalogService;

    @GetMapping("/product/{uniqId}")
    public ResponseEntity<Product> findByUniqId(@PathVariable Long uniqId) {
        Product product = catalogService.getProductById(uniqId);
        return ResponseEntity.ok(product);
    }

}
