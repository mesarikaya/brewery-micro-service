package com.mes.microservices.brewerymicroservice.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.sql.Timestamp;
import java.util.UUID;

/**
 * Created by mesar on 2/12/2020
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beer {

    @Null
    private UUID id;

    @NotBlank
    private String beerName;
    private String beerStyle;

    @Positive
    @NotNull
    private Long upc;


    private Timestamp createdDate;
    private Timestamp lastUpdatedDate;
}
