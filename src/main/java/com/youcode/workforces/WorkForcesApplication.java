package com.youcode.workforces;

import com.youcode.workforces.entities.Department;
import com.youcode.workforces.entities.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WorkForcesApplication {

    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("spring-config.xml");
        Department department = appContext.getBean(Department.class);
        Employee employee = appContext.getBean(Employee.class);

        System.out.println(department);
        System.out.println(employee);
    }

}
