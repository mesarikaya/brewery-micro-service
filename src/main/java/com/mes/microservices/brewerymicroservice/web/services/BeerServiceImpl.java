package com.mes.microservices.brewerymicroservice.web.services;

import com.mes.microservices.brewerymicroservice.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.UUID;

/**
 * Created by mesar on 2/7/2020
 */
@Slf4j
@Component
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto getBeerById(UUID uuid) {
        return BeerDto.builder()
                      .id(uuid)
                      .beerName("Efes Pilsener")
                      .beerStyle("Blonde")
                      .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {

        return beerDto.builder()
                      .id(UUID.randomUUID())
                      .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        // TODO: implement update beer
    }

    @Override
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(UUID beerId) {
        // TODO: implement delete beer
        log.info("This is deleteing beer with id: " + beerId);
    }
}
