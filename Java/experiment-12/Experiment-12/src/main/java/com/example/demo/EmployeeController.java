package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee) {
        return service.addEmployee(employee);
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return service.getEmployees();
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable int id) {
        return service.getEmployeeById(id);
    }

    @PutMapping("/employee/{id}")
    public Employee updateEmployee(@PathVariable int id,
                                   @RequestBody Employee employee) {

        return service.updateEmployee(id, employee);
    }

    @DeleteMapping("/employee/{id}")
    public String deleteEmployee(@PathVariable int id) {
        return service.deleteEmployee(id);
    }
}