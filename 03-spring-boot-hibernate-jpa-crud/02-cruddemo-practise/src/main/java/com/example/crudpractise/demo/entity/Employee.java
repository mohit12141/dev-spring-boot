package com.example.crudpractise.demo.entity;

import jakarta.persistence.*;

@Entity
public class Employee {
    @Id
    @Column(name = "empid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    public Employee(){

    }

    public Employee(String theName , String theEmail){
        this.name = theName;
        this.email = theEmail;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", fName='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
