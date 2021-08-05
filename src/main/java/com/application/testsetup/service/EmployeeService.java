package com.application.testsetup.service;

import com.application.testsetup.entity.Employee;
import com.application.testsetup.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    public Employee add(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee getByEmployeeId(Long employeeId) {
        return employeeRepository.getById(employeeId);
    }
}
