package org.example.repository;

import org.example.model.ProductStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository
public interface InventoryRepository extends JpaRepository<ProductStatus, Long> {
    Optional<ProductStatus> findByUniqId(Long uniqId);

    List<ProductStatus> findByUniqIdIn(Set<Long> uniqIds);
}
