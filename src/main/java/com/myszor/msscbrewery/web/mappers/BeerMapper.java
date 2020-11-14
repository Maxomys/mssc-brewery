package com.myszor.msscbrewery.web.mappers;

import com.myszor.msscbrewery.domain.Beer;
import com.myszor.msscbrewery.web.model.BeerDto;
import com.myszor.msscbrewery.web.model.v2.BeerDtoV2;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDtoV2 beerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDtoV2 dto);

}
