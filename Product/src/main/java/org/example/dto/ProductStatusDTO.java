package org.example.dto;

import lombok.Data;

@Data
public class ProductStatusDTO {
    private Long uniqId;
    private ProductStatusEnum productStatus;
    public enum ProductStatusEnum {
        AVAILABLE,
        OUT_OF_STOCK
    }
}
