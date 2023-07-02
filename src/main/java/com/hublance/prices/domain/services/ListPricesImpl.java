package com.hublance.prices.domain.services;

import com.hublance.prices.domain.gateway.PricesGateway;
import com.hublance.prices.domain.model.PricesRequestDTO;
import com.hublance.prices.domain.model.PricesResponseDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
public class ListPricesImpl implements PricesService {

    private final PricesGateway repository;

    @Override
    public List<PricesResponseDTO> ListPrices(PricesRequestDTO pricesRequestDTO) {
        if(Objects.isNull(pricesRequestDTO)) {
            throw new IllegalArgumentException("PricesRequestDTO is null");
        }
        return repository.findAll(pricesRequestDTO);
    }
}
