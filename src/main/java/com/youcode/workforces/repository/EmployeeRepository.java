package com.youcode.workforces.repository;

import com.youcode.workforces.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface EmployeeRepository  extends JpaRepository<Employee, Long> {

    List<Employee> findEmployeeBySalaryGreaterThan(Double a);
    List<Employee> findEmployeeBySalaryGreaterThanAndSalaryLessThan(Double a, Double c);
    boolean existsById(Long id);
}
