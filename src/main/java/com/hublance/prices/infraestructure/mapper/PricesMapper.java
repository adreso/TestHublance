package com.hublance.prices.infraestructure.mapper;

import com.hublance.prices.domain.model.PricesRequestDTO;
import com.hublance.prices.domain.model.PricesResponseDTO;
import com.hublance.prices.infraestructure.model.PricesEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PricesMapper {

    PricesResponseDTO mapEntityToModel(PricesEntity pricesEntity);
}
