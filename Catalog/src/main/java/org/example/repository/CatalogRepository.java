package org.example.repository;

import org.example.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CatalogRepository extends JpaRepository<Product, Long> {
    Optional<Product> findByUniqId(Long id);

    List<Product> findBySku(String sku);
}
