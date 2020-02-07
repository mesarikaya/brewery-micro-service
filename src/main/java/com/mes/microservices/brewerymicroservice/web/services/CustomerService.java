package com.mes.microservices.brewerymicroservice.web.services;

import com.mes.microservices.brewerymicroservice.web.model.CustomerDto;

import java.util.UUID;

/**
 * Created by mesar on 2/7/2020
 */
public interface CustomerService {
    CustomerDto getCustomerById(UUID uuid);
}
