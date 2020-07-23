package com.nirsb.webserver.test.Webservertest.controller;

import com.nirsb.webserver.test.Webservertest.model.Employee;
import com.nirsb.webserver.test.Webservertest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping(path = "/employees/{empId}", method = RequestMethod.GET)
    public Employee getEmployeeDetails(@PathVariable String empId){
        return employeeService.getEmployee(Long.parseLong(empId));
    }

    @RequestMapping(path = "/employee", method = RequestMethod.POST)
    public Long getEmployeeDetails(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }


}
