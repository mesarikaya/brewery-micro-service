package com.mes.microservices.brewerymicroservice.web.services;

import com.mes.microservices.brewerymicroservice.web.model.BeerDto;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * Created by mesar on 2/7/2020
 */
@Component
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto getBeerById(UUID uuid) {
        return BeerDto
                .builder()
                .uuid(uuid)
                .beerName("Efes Pilsener")
                .beerStyle("Blonde")
                .build();
    }
}
