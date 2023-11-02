package com.youcode.workforces.service;

import com.youcode.workforces.entities.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {
    List<Department> findAll();

    Department save(Department employee);

    Department update(Department employee);

    void delete(Department employee);

    Long count();

    Optional<Department> findByNameIgnoreCase(String name);
}
