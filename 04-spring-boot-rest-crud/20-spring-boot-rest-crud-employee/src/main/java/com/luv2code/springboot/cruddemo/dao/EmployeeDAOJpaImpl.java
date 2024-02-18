package com.luv2code.springboot.cruddemo.dao;

import com.luv2code.springboot.cruddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO{

    // define entity manager
    private EntityManager entityManager;

    // define constructor injection
    @Autowired
    public EmployeeDAOJpaImpl(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }
    @Override
    public List<Employee> findAll() {

        // create a query
        TypedQuery<Employee> theQuery = entityManager.createQuery("FROM Employee", Employee.class);

        // execute query and get result
        List<Employee> employees = theQuery.getResultList();

        // return result
        return employees;
    }

    @Override
    public Employee findById(int theId) {
        // find the employee
        Employee theEmployee = entityManager.find(Employee.class, theId);

        // return the employee
        return theEmployee;
    }

    @Override
    public Employee save(Employee theEmployee) {
        // save employee
        Employee dbEmployee = entityManager.merge(theEmployee);

        // return employee
        return dbEmployee;
    }

    @Override
    public void deleteById(int theId) {
        // find employee by id
        Employee theEmployee = entityManager.find(Employee.class, theId);

        // remove the employee
        entityManager.remove(theEmployee);
    }
}
