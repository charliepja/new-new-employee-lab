package com.example.codeclan.employeeLab.models;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "departments")
public class Department {

    @Column
    private String name;

    @OneToMany(mappedBy = "department")
    private List<Employee> employees;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long department_id;


    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public Department(){

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return this.employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Long getId() {
        return this.department_id;
    }

    public void setId(Long id) {
        this.department_id = id;
    }
}
