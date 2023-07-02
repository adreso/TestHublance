package com.hublance.prices.application.controller.rest;


import com.hublance.prices.domain.model.PricesRequestDTO;
import com.hublance.prices.domain.model.PricesResponseDTO;
import com.hublance.prices.domain.services.PricesService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@AllArgsConstructor
public class PricesController {

    private PricesService pricesService;

    @PostMapping(value = "/prices", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<PricesResponseDTO>> ListPrices(@RequestBody PricesRequestDTO pricesRequestDTO) {
        return ResponseEntity.ok(pricesService.ListPrices(pricesRequestDTO));
    }
}
