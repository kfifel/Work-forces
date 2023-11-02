package com.youcode.workforces.repository;

import com.youcode.workforces.entities.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface EmployeeRepository  extends CrudRepository<Employee, Long> {

    public List<Employee> findEmployeeBySalaryGreaterThan(Double a);
    public List<Employee> findEmployeeBySalaryGreaterThanAndSalaryLessThan(Double a, Double c);
}
