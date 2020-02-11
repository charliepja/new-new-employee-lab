package com.example.codeclan.employeeLab.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "employees")
public class Employee {

    @Column
    private String firstName;

    @Column
    private String lastName;

    @ManyToMany
    @JoinTable(
            name = "Employees_Projects",
            joinColumns = { @JoinColumn(
                    name = "employee_id",
                    nullable = false,
                    updatable = false
            )
            },
            inverseJoinColumns = {
                    @JoinColumn (
                            name = "project_id",
                            nullable = false,
                            updatable = false
                    )
            }
    )
    private List<Project> projects;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;

    @ManyToOne
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;

    public Employee(String firstName, String lastName, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.projects = new ArrayList<>();
    }

    public Employee() {

    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Project> getProjects() {
        return this.projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public Long getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Department getDepartmentId() {
        return this.department;
    }

    public void setDepartmentId(Department department) {
        this.department = department;
    }

    public void addProject(Project project){
        this.projects.add(project);
    }
}
