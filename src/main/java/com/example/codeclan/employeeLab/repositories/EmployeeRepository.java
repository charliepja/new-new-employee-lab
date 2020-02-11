package com.example.codeclan.employeeLab.repositories;

import com.example.codeclan.employeeLab.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
