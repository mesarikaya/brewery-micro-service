package com.mes.microservices.brewerymicroservice.web.mappers;

import com.mes.microservices.brewerymicroservice.domain.Customer;
import com.mes.microservices.brewerymicroservice.web.model.CustomerDto;
import org.mapstruct.Mapper;

/**
 * Created by mesar on 2/12/2020
 */
@Mapper
public interface CustomerMapper {

    CustomerDto customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDto customerDto);
}
