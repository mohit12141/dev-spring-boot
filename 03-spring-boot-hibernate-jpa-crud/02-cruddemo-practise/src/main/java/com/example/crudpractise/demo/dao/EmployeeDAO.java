package com.example.crudpractise.demo.dao;

import com.example.crudpractise.demo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> findAll();
}
