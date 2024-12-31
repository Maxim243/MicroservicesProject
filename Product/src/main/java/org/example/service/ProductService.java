package org.example.service;

import org.example.dto.ProductDTO;
import org.example.dto.ProductStatusDTO;
import org.example.exceptions.ProductNotAvailableException;
import org.example.repository.CatalogClient;
import org.example.repository.InventoryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private CatalogClient catalogClient;
    @Autowired
    private InventoryClient inventoryClient;

    public ProductDTO getAvailableProduct(Long uniqId) {
        ProductDTO productDTO = catalogClient.findByUniqId(uniqId);
        ProductStatusDTO productStatusDTO = inventoryClient.findProductStatusByUniqId(uniqId);

        if (!productStatusDTO.getProductStatus().equals(ProductStatusDTO.ProductStatusEnum.AVAILABLE)) {
            throw new ProductNotAvailableException("No available item was found with id: " + uniqId);
        }

        return productDTO;
    }

}
