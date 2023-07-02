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
public class PricesResponseDTO {
    private Integer productId;
    private Integer brandId;
    private Integer priceList;
    private Timestamp startDate;
    private Timestamp endDate;
    private Double price;
}
