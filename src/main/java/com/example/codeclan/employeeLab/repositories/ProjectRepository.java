package com.example.codeclan.employeeLab.repositories;

import com.example.codeclan.employeeLab.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
