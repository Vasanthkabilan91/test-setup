package com.application.testsetup.controller;

import com.application.testsetup.entity.Employee;
import com.application.testsetup.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/employee/{id}")
    public Employee employeeGetById(@PathVariable("id") long employeeId) {
        return employeeService.getByEmployeeId(employeeId);
    }

    @PostMapping
    public Employee add(@RequestBody Employee newEmployee) {
        return employeeService.add(newEmployee);
    }
}
