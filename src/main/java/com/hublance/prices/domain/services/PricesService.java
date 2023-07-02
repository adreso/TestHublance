package com.hublance.prices.domain.services;

import com.hublance.prices.domain.model.PricesRequestDTO;
import com.hublance.prices.domain.model.PricesResponseDTO;

import java.util.List;

public interface PricesService {
    List<PricesResponseDTO> ListPrices(PricesRequestDTO pricesRequestDTO);

}
