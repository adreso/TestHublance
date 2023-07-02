package com.hublance.prices.infraestructure.gateway;

import com.hublance.prices.domain.gateway.PricesGateway;
import com.hublance.prices.domain.model.PricesRequestDTO;
import com.hublance.prices.domain.model.PricesResponseDTO;
import com.hublance.prices.infraestructure.H2PricesRepository;
import com.hublance.prices.infraestructure.mapper.PricesMapper;
import com.hublance.prices.infraestructure.model.PricesEntity;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class PricesGatewayImpl implements PricesGateway {

    @NonNull
    private final PricesMapper pricesMapper;
    @NonNull
    private final H2PricesRepository repository;

    @Override
    public List<PricesResponseDTO> findAll(PricesRequestDTO pricesRequestDTO) {
        List<PricesEntity> pricesEntity = repository.findPricesByCriteria(pricesRequestDTO.getDateApplication(), pricesRequestDTO.getBrandId(), pricesRequestDTO.getProductId());
        List<PricesResponseDTO> registros = new ArrayList<>();
        pricesEntity.forEach(prices-> registros.add(pricesMapper.mapEntityToModel(prices)));
        return registros;
    }
}
