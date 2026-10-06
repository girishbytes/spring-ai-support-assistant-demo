package com.gs.support.customer;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.OffsetDateTime;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    private Long id;

    @Column(nullable = false, length = 150)
    private String name;

    @Column(nullable = false, unique = true, length = 255)
    private String email;

    @Column(name = "created_at", nullable = false)
    private OffsetDateTime createdAt;

    protected Customer() {
        // Required by JPA
    }

    public Customer(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.createdAt = OffsetDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }
}