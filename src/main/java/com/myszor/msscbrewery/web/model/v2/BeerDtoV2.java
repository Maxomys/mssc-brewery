package com.myszor.msscbrewery.web.model.v2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDtoV2 {

    @Null
    private UUID id;

    @NotBlank
    private String beerName;

    private BeerStyleEnum beerStyle;

    //universal product code
    private Long upc;

}
