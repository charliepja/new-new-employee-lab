package com.example.codeclan.employeeLab;

import com.example.codeclan.employeeLab.models.Department;
import com.example.codeclan.employeeLab.models.Employee;
import com.example.codeclan.employeeLab.models.Project;
import com.example.codeclan.employeeLab.repositories.DepartmentRepository;
import com.example.codeclan.employeeLab.repositories.EmployeeRepository;
import com.example.codeclan.employeeLab.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmployeeLabApplicationTests {
	@Autowired
	DepartmentRepository departmentRepository;
	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void canAddToDatabase(){
		Department department = new Department("accounts");
		Employee employee = new Employee("Debbie", "Urquhart", department);
		Project project = new Project("count The Monies", 4);


		departmentRepository.save(department);
		employeeRepository.save(employee);
		projectRepository.save(project);
		employee.addProject(project);
		project.addEmployee(employee);
		employeeRepository.save(employee);
		projectRepository.save(project);

	}

}
