package com.youcode.workforces.repository;

import com.youcode.workforces.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    @Modifying
    @Query("UPDATE Department d SET d = :department WHERE d.id = :id")
    Department updateDepartmentById(Long id, Department department);

    Optional<Department> findByName(String name);
    Optional<Department> findByNameIgnoreCase(String name);
}
