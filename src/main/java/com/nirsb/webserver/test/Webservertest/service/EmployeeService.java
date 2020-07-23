package com.nirsb.webserver.test.Webservertest.service;

import com.nirsb.webserver.test.Webservertest.Repository.EmployeeRepository;
import com.nirsb.webserver.test.Webservertest.exception.EmployeeNotFoundExceptions;
import com.nirsb.webserver.test.Webservertest.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee getEmployee(long empId){
           return employeeRepository.findById(empId).orElseThrow(()->new EmployeeNotFoundExceptions("Employee Not Available: "+empId));
    }

    public Long saveEmployee(Employee employee){
        return  employeeRepository.save(employee).getEmpId();
    }
}
