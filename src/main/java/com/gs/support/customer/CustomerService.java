package com.gs.support.customer;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerResponse getCustomer(Long customerId) {

        Customer customer = customerRepository.findById(customerId)
                .orElseThrow(() -> new CustomerNotFoundException(customerId));

        return CustomerResponse.from(customer);
    }
}