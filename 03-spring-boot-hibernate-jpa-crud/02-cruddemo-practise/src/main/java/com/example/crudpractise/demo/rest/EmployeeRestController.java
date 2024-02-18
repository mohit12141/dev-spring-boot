package com.example.crudpractise.demo.rest;

import com.example.crudpractise.demo.dao.EmployeeDAO;
import com.example.crudpractise.demo.dao.EmployeeDAOImpl;
import com.example.crudpractise.demo.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeRestController {

    private EmployeeDAO employeeDAO;

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping("/employee")
    public List<Employee> getData(){
        return employeeDAO.findAll();
    }
}
