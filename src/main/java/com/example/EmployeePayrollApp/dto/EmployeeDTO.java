package com.example.EmployeePayrollApp.dto;

import lombok.Data;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Min;

@Data
public class EmployeeDTO {

    @NotEmpty(message = "Department cannot be empty")
    private String department;

    @NotEmpty(message = "Employee name cannot be empty")
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee name must start with a capital letter and be at least 3 characters long")
    private String name;

    @Min(value = 1000, message = "Salary must be at least 1000")
    private double salary;
}