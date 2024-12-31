package org.example.repository;

import org.example.dto.ProductStatusDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Set;

@FeignClient(name = "inventory-service", url = "http://localhost:8082", path = "/inventory")
public interface InventoryClient {

    @PostMapping("/products")
    ProductStatusDTO findListOfProductsStatusByUniqId(@RequestBody Set <Long> uniqId);
    @GetMapping("/product/{uniqId}")
    ProductStatusDTO findProductStatusByUniqId(@PathVariable Long uniqId);
}
