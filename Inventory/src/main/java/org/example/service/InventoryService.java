package org.example.service;

import org.example.model.ProductStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.repository.InventoryRepository;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Set;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    public List<ProductStatus> getAvailabilityProductsList(Set<Long> productUniqIds) {
        return inventoryRepository.findByUniqIdIn(productUniqIds);
    }
    public ProductStatus getProductAvailabilityByUniqId(Long uniqId) {
        Optional<ProductStatus> productStatusOptional = inventoryRepository.findByUniqId(uniqId);
        return productStatusOptional.orElseThrow(() -> new NoSuchElementException("No product available was found with id: " + uniqId));
    }
}
