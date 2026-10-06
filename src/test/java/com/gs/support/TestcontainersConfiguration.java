package com.gs.support;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.testcontainers.containers.PostgreSQLContainer;

@TestConfiguration(proxyBeanMethods = false)
public class TestcontainersConfiguration {

    @ServiceConnection
    PostgreSQLContainer<?> postgres =
            new PostgreSQLContainer<>("postgres:17");
}
