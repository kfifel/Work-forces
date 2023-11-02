package com.youcode.workforces.service.impl;

import com.youcode.workforces.entities.Department;
import com.youcode.workforces.repository.DepartmentRepository;
import com.youcode.workforces.service.DepartmentService;

import java.util.List;
import java.util.Optional;

public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository employeeRepository) {
        this.departmentRepository = employeeRepository;
    }

    @Override
    public List<Department> findAll() {
        return departmentRepository.findAll();
    }

    @Override
    public Department save(Department employee) {
        return departmentRepository.save(employee);
    }

    @Override
    public Department update(Department employee) {
        return departmentRepository.updateDepartmentById(employee.getId(), employee);
    }

    @Override
    public void delete(Department employee) {
        departmentRepository.delete(employee);
    }

    @Override
    public Long count() {
        return departmentRepository.count();
    }

    @Override
    public Optional<Department> findByNameIgnoreCase(String name) {
        return departmentRepository.findByNameIgnoreCase(name);
    }
}
