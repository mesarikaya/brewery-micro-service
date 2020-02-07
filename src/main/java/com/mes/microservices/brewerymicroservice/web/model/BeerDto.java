package com.mes.microservices.brewerymicroservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * Created by mesarikaya on 2/7/2020
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
    private UUID uuid;
    private String beerName;
    private String beerStyle;
    private Long upc;
}
