package com.timoshey.employeeservice.service;

import com.timoshey.employeeservice.dto.ApiResponseDto;
import com.timoshey.employeeservice.dto.EmployeeDto;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);
    ApiResponseDto getEmployeeById(Long employeeId);
}
