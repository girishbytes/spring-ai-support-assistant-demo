package com.gs.support.customer;

public class CustomerNotFoundException extends RuntimeException {

    public CustomerNotFoundException(Long customerId) {
        super("Customer not found: " + customerId);
    }
}