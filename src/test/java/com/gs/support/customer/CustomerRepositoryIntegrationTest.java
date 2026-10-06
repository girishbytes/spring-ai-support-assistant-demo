package com.gs.support.customer;

import com.gs.support.TestcontainersConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Import(TestcontainersConfiguration.class)
class CustomerRepositoryIntegrationTest {

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    void shouldPersistAndRetrieveCustomer() {

        Customer customer = new Customer(
                1001L,
                "abc d",
                "abc@example.com"
        );

        customerRepository.save(customer);

        Customer savedCustomer = customerRepository
                .findById(1001L)
                .orElseThrow();

        assertThat(savedCustomer.getName())
                .isEqualTo("abc d");

        assertThat(savedCustomer.getEmail())
                .isEqualTo("abc@example.com");
    }
}