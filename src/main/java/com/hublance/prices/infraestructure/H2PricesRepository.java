package com.hublance.prices.infraestructure;

import com.hublance.prices.infraestructure.model.PricesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Timestamp;
import java.util.List;

public interface H2PricesRepository extends JpaRepository<PricesEntity, Integer> {

        @Query("select pr from PricesEntity pr " +
                "where (pr.startDate <= ?1 and pr.endDate >= ?1) and pr.brandId = ?2 and pr.productId = ?3 ")
        List<PricesEntity> findPricesByCriteria(Timestamp fecha, Integer brandId, Integer productId);
}
