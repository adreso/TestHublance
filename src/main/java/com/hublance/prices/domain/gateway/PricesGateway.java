package com.hublance.prices.domain.gateway;

import com.hublance.prices.domain.model.PricesRequestDTO;
import com.hublance.prices.domain.model.PricesResponseDTO;

import java.util.List;

public interface PricesGateway {
    List<PricesResponseDTO> findAll(PricesRequestDTO pricesRequestDTO);
}
