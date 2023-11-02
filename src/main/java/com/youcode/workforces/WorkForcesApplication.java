package com.youcode.workforces;

import com.youcode.workforces.config.JpaConfig;
import com.youcode.workforces.entities.Department;
import com.youcode.workforces.entities.Employee;
import com.youcode.workforces.repository.EmployeeRepository;
import com.youcode.workforces.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.time.LocalDateTime;

public class WorkForcesApplication {

    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("spring-config.xml");
        //ApplicationContext appContext = new AnnotationConfigApplicationContext(JpaConfig.class);
        //DataSource dataSource = appContext.getBean(DriverManagerDataSource.class);

        DriverManagerDataSource dataSource = appContext.getBean("dataSource", DriverManagerDataSource.class);
        EmployeeRepository repository = appContext.getBean(EmployeeRepository.class);
        EmployeeService employeeService = appContext.getBean(EmployeeService.class);

      // System.out.println(repository.findAll());

        repository.findEmployeeBySalaryGreaterThanAndSalaryLessThan(1_000D, 12_001D).forEach(System.out::println);

        System.out.println(dataSource);
    }

}
