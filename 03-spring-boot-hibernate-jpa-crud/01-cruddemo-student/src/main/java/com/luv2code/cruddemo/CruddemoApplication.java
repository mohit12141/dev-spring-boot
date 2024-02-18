package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner -> {
			// createStudent(studentDAO);

			// createMultipleStudent(studentDAO);

			// readStudent(studentDAO);

			// queryForStudent(studentDAO);

			// queryForStudentsByLastName(studentDAO);

			// updateStudent(studentDAO);

			// deleteStudent(studentDAO);

			deleteAllStudents(studentDAO);
		};
	}

	private void deleteAllStudents(StudentDAO studentDAO) {
		System.out.println("Deleting all Students ...");
		int numRowsDeleted = studentDAO.deleteAll();
		System.out.println("Students deleted: " + numRowsDeleted);
	}

	private void deleteStudent(StudentDAO studentDAO) {

		int studentId = 8;
		System.out.println("Deleting the student id: " + studentId);
		studentDAO.delete(studentId);

	}

	private void updateStudent(StudentDAO studentDAO) {
		// retrieve student based on primary key : id
		int studentId = 6;
		System.out.println("Getting student with id: " + studentId);
		Student myStudent = studentDAO.findById(studentId);

		// change student firstname
		System.out.println("Updating student ...");
		myStudent.setFirstName("Scooby");

		// update student
		studentDAO.update(myStudent);

		// display student
		System.out.println("Updated Student: " + myStudent);
	}

	private void queryForStudentsByLastName(StudentDAO studentDAO) {
		// retrieve the result
		List<Student> theStudent = studentDAO.findByLastName("Duck");

		// display the result
		for(Student tempStudent : theStudent){
			System.out.println(tempStudent);
		}
	}

	private void queryForStudent(StudentDAO studentDAO) {
		// retrieve list of students
		List<Student> theStudent = studentDAO.findAll();

		// display result
		for(Student tempStudent : theStudent){
			System.out.println(tempStudent);
		}
	}

	private void readStudent(StudentDAO studentDAO) {
		// create student object
		System.out.println("Creating student object ...");
		Student tempStudent = new Student("Daffy","Duck","daffy@luv2code.com");

		// save the student
		System.out.println("Saving the student object ...");
		studentDAO.save(tempStudent);

		// display id of the saved student
		int theId = tempStudent.getId();
		System.out.println("Saved student. Generated id: " + theId);

		// retrieve student based on the id: primary key
		System.out.println("Retrieving student with id: " + theId);
		Student myStudent = studentDAO.findById(theId);

		// display student
		System.out.println("Found the student: " + myStudent);
	}

	private void createMultipleStudent(StudentDAO studentDAO) {
		// create student object
		System.out.println("Creating 3 student object");
		Student tempStudent1 = new Student("John","Doe","john@luv2code.com");
		Student tempStudent2 = new Student("Mary","Doe","mary@luv2code.com");
		Student tempStudent3 = new Student("Bounita","Doe","bounita@luv2code.com");

		// save student object
		System.out.println("Saving the students ...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);


	}

	private void createStudent(StudentDAO studentDAO) {
		// create student object
		System.out.println("Creating new Student object ...");
		Student tempStudent = new Student("Paul","Doe", "paul@luv2code.com");

		// save the student object
		System.out.println("Saving the Student Object ...");
		studentDAO.save(tempStudent);

		// display id of the saved student
		System.out.println("Saved Student. Generated id: " + tempStudent.getId());
	}
}
