package com.studentgrading;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentGradingSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentGradingSystemApplication.class, args);
        System.out.println("Student Grading System is running on http://localhost:8080");
    }
}
