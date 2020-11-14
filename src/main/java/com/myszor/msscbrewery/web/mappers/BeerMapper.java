package com.myszor.msscbrewery.web.mappers;

import com.myszor.msscbrewery.domain.Beer;
import com.myszor.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto dto);

}
