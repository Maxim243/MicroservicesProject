package org.example.controller;

import org.example.model.ProductStatus;
import org.example.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/inventory")
public class InventoryController {
    @Autowired
    private InventoryService inventoryService;

    @PostMapping("/products")
    public ResponseEntity<?> getAvailableProductsList(@RequestBody Set<Long> productsUniqIds) {
        if (productsUniqIds.isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("The products ids can't be empty");
        }
        List<ProductStatus> productStatuses = inventoryService.getAvailabilityProductsList(productsUniqIds);

        if (productStatuses.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No products found for the given IDs");
        }

        return ResponseEntity.ok(productStatuses);
    }

    @GetMapping("/product/{uniqId}")
    public ResponseEntity<ProductStatus> getAvailableProduct(@PathVariable Long uniqId) {
        ProductStatus productAvailabilityEntity = inventoryService.getProductAvailabilityByUniqId(uniqId);
        return ResponseEntity.ok(productAvailabilityEntity);
    }
}
