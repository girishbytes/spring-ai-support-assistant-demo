package com.gs.support.api;

import com.gs.support.customer.CustomerNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.OffsetDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomerNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handleCustomerNotFound(
            CustomerNotFoundException exception) {

        return new ErrorResponse(
                "CUSTOMER_NOT_FOUND",
                exception.getMessage(),
                OffsetDateTime.now()
        );
    }

    public record ErrorResponse(
            String code,
            String message,
            OffsetDateTime timestamp
    ) {
    }
}
