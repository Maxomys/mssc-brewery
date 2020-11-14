package com.myszor.msscbrewery.web.mappers;

import com.myszor.msscbrewery.domain.Customer;
import com.myszor.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    CustomerDto customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDto dto);

}
