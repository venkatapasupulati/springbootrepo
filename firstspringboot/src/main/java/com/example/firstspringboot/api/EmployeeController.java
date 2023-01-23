package com.example.firstspringboot.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;
       
    @GetMapping("/employees")
    public List<Employee> listAll() {
        List<Employee> employees = employeeRepository.findAll();
        
           
        return employees;
    }
       
}