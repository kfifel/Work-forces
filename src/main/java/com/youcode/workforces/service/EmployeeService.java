package com.youcode.workforces.service;

import com.youcode.workforces.entities.Employee;
import com.youcode.workforces.repository.EmployeeRepository;

import java.util.List;

public class EmployeeService {
    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    public List<Employee> findEmployeeBySalaryGreaterThan(Double a){
        return employeeRepository.findEmployeeBySalaryGreaterThan(a);
    }

    public List<Employee> findAll() {
        return (List<Employee>) employeeRepository.findAll();
    }

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee update(Employee employee) {
        return null;
    }

}
