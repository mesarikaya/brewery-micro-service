package com.mes.microservices.brewerymicroservice.web.mappers;

import com.mes.microservices.brewerymicroservice.domain.Beer;
import com.mes.microservices.brewerymicroservice.web.model.BeerDto;
import org.mapstruct.Mapper;

/**
 * Created by mesar on 2/12/2020
 */
@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
