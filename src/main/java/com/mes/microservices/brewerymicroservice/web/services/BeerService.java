package com.mes.microservices.brewerymicroservice.web.services;

import com.mes.microservices.brewerymicroservice.web.model.BeerDto;

import java.util.UUID;

/**
 * Created by mesarikaya on 2/7/2020
 */
public interface BeerService {

    BeerDto getBeerById(UUID uuid);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);

    void deleteById(UUID beerId);
}
