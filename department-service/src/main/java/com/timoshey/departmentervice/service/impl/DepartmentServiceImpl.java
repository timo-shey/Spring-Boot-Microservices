package com.timoshey.departmentervice.service.impl;

import com.timoshey.departmentervice.dto.DepartmentDto;
import com.timoshey.departmentervice.entity.Department;
import com.timoshey.departmentervice.repository.DepartmentRepository;
import com.timoshey.departmentervice.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;

    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {
        Department department  = DepartmentDto.mapToDepartment(departmentDto);
        Department savedDepartment = departmentRepository.save(department);
        return DepartmentDto.mapToDepartmentDto(savedDepartment);
    }

    @Override
    public DepartmentDto getDepartmentByCode(String departmentCode) {
        Department department = departmentRepository.findByDepartmentCode(departmentCode);
        return DepartmentDto.mapToDepartmentDto(department);
    }
}
