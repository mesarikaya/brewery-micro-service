package com.mes.microservices.brewerymicroservice.web.controller;

import com.mes.microservices.brewerymicroservice.web.model.CustomerDto;
import com.mes.microservices.brewerymicroservice.web.services.CustomerService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * Created by mesar on 2/7/2020
 */
@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable UUID customerId){
        return new ResponseEntity<>(customerService.getCustomerById(customerId), HttpStatus.ACCEPTED);
    }

    @PostMapping
    public ResponseEntity handlePost(@RequestBody CustomerDto customerDto){

        CustomerDto saveDto = customerService.saveNewCustomer(customerDto);

        HttpHeaders httpHeaders = new HttpHeaders();
        // TODO: Ad host name to url
        httpHeaders.add("Location", "/api/v1/customer/" + saveDto.getId().toString());

        return new ResponseEntity(httpHeaders,  HttpStatus.CREATED);
    }

    @PutMapping({"/{customerId}"})
    public ResponseEntity handleUpdate(@PathVariable("customerId") UUID customerId, @RequestBody CustomerDto customerDto){

        customerService.updateCustomer(customerId, customerDto);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{customerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void handleDelete(@PathVariable("customerId") UUID customerId){
        customerService.deletebyId(customerId);
    }
}
