package com.studentgrading.service;

import com.studentgrading.entity.Student;
import com.studentgrading.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student student) {
        // Calculate average
        double average = (student.getClassTest1() + student.getClassTest2() + student.getClassTest3()) / 3.0;
        student.setAverage(average);

        // Determine status based on average (out of 20)
        // 80% of 20 = 16, 75% of 20 = 15
        String status;
        if (average >= 16) {
            status = "Excellent";
        } else if (average >= 15) {
            status = "Good";
        } else {
            status = "Try Harder";
        }
        student.setStatus(status);

        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    public Student updateStudent(Student student) {
        // Recalculate average and status
        double average = (student.getClassTest1() + student.getClassTest2() + student.getClassTest3()) / 3.0;
        student.setAverage(average);

        // Determine status based on average (out of 20)
        // 80% of 20 = 16, 75% of 20 = 15
        String status;
        if (average >= 16) {
            status = "Excellent";
        } else if (average >= 15) {
            status = "Good";
        } else {
            status = "Try Harder";
        }
        student.setStatus(status);

        return studentRepository.save(student);
    }
}
