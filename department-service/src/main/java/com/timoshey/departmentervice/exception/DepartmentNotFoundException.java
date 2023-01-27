package com.timoshey.departmentervice.exception;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
@AllArgsConstructor
public class DepartmentNotFoundException extends RuntimeException{
    private HttpStatus status;
    private String message;

    public DepartmentNotFoundException(String message, HttpStatus status, String message1) {
        super(message);
        this.status = status;
        this.message = message1;
    }
}
