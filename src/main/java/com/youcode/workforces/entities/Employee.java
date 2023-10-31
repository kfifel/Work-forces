package com.youcode.workforces.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {
    private Long id;
    private String name;
    private LocalDateTime createdAt;
    private Double salary;

}
