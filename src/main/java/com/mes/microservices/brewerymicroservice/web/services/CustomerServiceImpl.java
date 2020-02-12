package com.mes.microservices.brewerymicroservice.web.services;

import com.mes.microservices.brewerymicroservice.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * Created by mesar on 2/7/2020
 */
@Slf4j
@Component
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerById(UUID uuid) {
        return CustomerDto
                .builder()
                .id(uuid)
                .name("Ergin")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {

        return CustomerDto.builder()
                           .id(UUID.randomUUID())
                           .name(customerDto.getName())
                           .build();

    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        // TODO: implement customer update
    }

    @Override
    public void deletebyId(UUID customerId) {
        // TODO: Implement delete by ID
    }
}
