package com.hublance.prices.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PricesRequestDTO {
    private Timestamp dateApplication;
    private Integer brandId;
    private Integer productId;
}
