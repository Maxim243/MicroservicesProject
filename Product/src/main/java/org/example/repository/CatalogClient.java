package org.example.repository;

import org.example.dto.ProductDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "catalog-service", url = "http://localhost:8081", path = "/catalog")
public interface CatalogClient {
    @GetMapping("/product/{uniqId}")
    ProductDTO findByUniqId(@PathVariable Long uniqId);

//    List<ProductDTO> findListOfProductsBySku(List<String> skus);

}
