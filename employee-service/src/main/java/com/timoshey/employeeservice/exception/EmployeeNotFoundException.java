package com.timoshey.employeeservice.exception;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
@AllArgsConstructor
public class EmployeeNotFoundException extends RuntimeException{
    private HttpStatus status;
    private String message;

    public EmployeeNotFoundException(String message, HttpStatus status, String message1) {
        super(message);
        this.status = status;
        this.message = message1;
    }
}
