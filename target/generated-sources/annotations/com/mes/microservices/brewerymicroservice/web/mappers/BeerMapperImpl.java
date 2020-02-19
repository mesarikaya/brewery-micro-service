package com.mes.microservices.brewerymicroservice.web.mappers;

import com.mes.microservices.brewerymicroservice.domain.Beer;
import com.mes.microservices.brewerymicroservice.web.model.BeerDto;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-02-19T23:35:51+0100",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.2 (AdoptOpenJDK)"
)
@Component
public class BeerMapperImpl implements BeerMapper {

    @Autowired
    private DateMapper dateMapper;

    @Override
    public BeerDto beerToBeerDto(Beer beer) {
        if ( beer == null ) {
            return null;
        }

        BeerDto beerDto = new BeerDto();

        beerDto.setId( beer.getId() );
        beerDto.setBeerName( beer.getBeerName() );
        beerDto.setBeerStyle( beer.getBeerStyle() );
        beerDto.setUpc( beer.getUpc() );
        beerDto.setCreatedDate( dateMapper.asOffsetDateTime( beer.getCreatedDate() ) );
        beerDto.setLastUpdatedDate( dateMapper.asOffsetDateTime( beer.getLastUpdatedDate() ) );

        return beerDto;
    }

    @Override
    public Beer beerDtoToBeer(BeerDto beerDto) {
        if ( beerDto == null ) {
            return null;
        }

        Beer beer = new Beer();

        beer.setId( beerDto.getId() );
        beer.setBeerName( beerDto.getBeerName() );
        beer.setBeerStyle( beerDto.getBeerStyle() );
        beer.setUpc( beerDto.getUpc() );
        beer.setCreatedDate( dateMapper.asTimestamp( beerDto.getCreatedDate() ) );
        beer.setLastUpdatedDate( dateMapper.asTimestamp( beerDto.getLastUpdatedDate() ) );

        return beer;
    }
}
