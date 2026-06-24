package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	public Employee addEmployee(Employee employee) {
		return repository.save(employee);
	}

	public List<Employee> getEmployees() {
		return repository.findAll();
	}

	public Employee getEmployeeById(int id) {
		return repository.findById(id).orElse(null);
	}

	public Employee updateEmployee(int id, Employee employee) {

		employee.setId(id);

		return repository.save(employee);

	}

	public String deleteEmployee(int id) {

		repository.deleteById(id);

		return "Employee Deleted Successfully";
	}
}