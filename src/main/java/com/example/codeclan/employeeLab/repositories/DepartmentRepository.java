package com.example.codeclan.employeeLab.repositories;

import com.example.codeclan.employeeLab.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
