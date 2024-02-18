package com.example.crudpractise.demo;

import com.example.crudpractise.demo.dao.EmployeeDAO;
import com.example.crudpractise.demo.entity.Employee;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner commandLineRunner(EmployeeDAO employeeDAO){
//		return runner -> {
//			findAllEmployee(employeeDAO);
//		};
//	}

	private void findAllEmployee(EmployeeDAO employeeDAO) {
		List<Employee> ans = employeeDAO.findAll();

		for(Employee emp : ans){
			System.out.println(emp);

		}
	}

}
