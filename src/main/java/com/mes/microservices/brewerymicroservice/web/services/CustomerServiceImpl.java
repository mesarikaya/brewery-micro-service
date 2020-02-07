package com.mes.microservices.brewerymicroservice.web.services;

import com.mes.microservices.brewerymicroservice.web.model.CustomerDto;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * Created by mesar on 2/7/2020
 */
@Component
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerById(UUID uuid) {
        return CustomerDto
                .builder()
                .uuid(uuid)
                .name("Ergin")
                .build();
    }
}
