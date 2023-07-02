package com.hublance.prices.infraestructure.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "prices")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PricesEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "brand_id")
    private Integer brandId;

    @Column(name = "start_date")
    private Timestamp startDate;

    @Column(name = "end_date")
    private Timestamp endDate;

    @Column(name = "price_list")
    private Integer priceList;

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "priority")
    private Integer priority;

    @Column(name = "price")
    private Double price;

    @Column(name = "curr")
    private String curr;

}
