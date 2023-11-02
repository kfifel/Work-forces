package com.youcode.workforces.service;

import com.youcode.workforces.entities.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findEmployeeBySalaryGreaterThan(Double a);

    List<Employee> findAll();

    Employee save(Employee employee);

    Employee update(Employee employee);

    void delete(Employee employee);
}
