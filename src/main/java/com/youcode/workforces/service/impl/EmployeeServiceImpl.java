package com.youcode.workforces.service.impl;

import com.youcode.workforces.entities.Department;
import com.youcode.workforces.entities.Employee;
import com.youcode.workforces.repository.EmployeeRepository;
import com.youcode.workforces.service.DepartmentService;
import com.youcode.workforces.service.EmployeeService;

import java.util.List;
import java.util.Optional;

public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final DepartmentService departmentService;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository, DepartmentService departmentService) {
        this.employeeRepository = employeeRepository;
        this.departmentService = departmentService;
    }


    @Override
    public List<Employee> findEmployeeBySalaryGreaterThan(Double a){
        return employeeRepository.findEmployeeBySalaryGreaterThan(a);
    }

    @Override
    public List<Employee> findAll() {
        return (List<Employee>) employeeRepository.findAll();
    }

    @Override
    public Employee save(Employee employee) {
        Employee result = null;
        if(employee.getDepartment().getId() == null) {
            String departmentName = employee.getDepartment().getName();
            Optional<Department> department = departmentService.findByNameIgnoreCase(departmentName);
            department.ifPresent(employee::setDepartment);
            department.orElseThrow(() -> new IllegalArgumentException("No department with this name: "+ departmentName));
            result = employeeRepository.save(employee);
        }
        return result;
    }

    public boolean isExistById(Long id) {
        return employeeRepository.existsById(id);
    }

    @Override
    public Employee update(Employee employee) {
        return null;
    }

    @Override
    public void delete(Employee employee) {
        employeeRepository.delete(employee);
    }

}
