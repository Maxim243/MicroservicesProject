package org.example.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ProductStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uniqId;
    @Enumerated(EnumType.STRING)
    private ProductStatusEnum productStatus;

    public enum ProductStatusEnum {
        AVAILABLE,
        OUT_OF_STOCK
    }

}
