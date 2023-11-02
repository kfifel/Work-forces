package com.youcode.workforces;

import com.youcode.workforces.entities.Department;
import com.youcode.workforces.entities.Employee;
import com.youcode.workforces.repository.EmployeeRepository;
import com.youcode.workforces.service.DepartmentService;
import com.youcode.workforces.service.EmployeeService;
import com.youcode.workforces.service.impl.DepartmentServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.time.LocalDateTime;

public class WorkForcesApplication {

    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("spring-config.xml");

        EmployeeService employeeService = appContext.getBean(EmployeeService.class);
        DepartmentService departmentService = appContext.getBean(DepartmentServiceImpl.class);

        addDepartment(departmentService);
        addEmployees(employeeService);

        System.out.println("finding all department: ======================================================");
        departmentService.findAll().forEach(System.out::println);

        System.out.println("finding all employee: ======================================================");
        employeeService.findAll().forEach(System.out::println);

    }

    private static void addDepartment(DepartmentService departmentService) {
        if(departmentService.count() == 0) {
            departmentService.save(Department.builder().name("Mathematics").build());
            departmentService.save(Department.builder().name("Informatics").build());
            departmentService.save(Department.builder().name("Physics").build());
            departmentService.save(Department.builder().name("Electronics").build());
        }
    }

    private static void addEmployees(EmployeeService employeeService) {
        Employee khalid = Employee.builder()
                .name("khalid")
                .salary(12_000.)
                .department(Department.builder()
                        .name("informatics")
                        .build())
                .createdAt(LocalDateTime.now())
                .build();
        Employee ali = Employee.builder()
                .name("ali")
                .salary(12_000.)
                .department(Department.builder()
                        .name("electronics")
                        .build())
                .createdAt(LocalDateTime.now()).build();
        Employee fatima = Employee.builder()
                .name("fatima")
                .salary(12_000.)
                .department(Department.builder()
                        .name("mathematics")
                        .build())
                .createdAt(LocalDateTime.now()).build();


        employeeService.save(khalid);
        employeeService.save(ali);
        employeeService.save(fatima);
    }

}
