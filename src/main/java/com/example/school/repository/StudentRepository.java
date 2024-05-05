package com.example.school.repository;

import com.example.school.model.Student;
import java.util.*;

public interface StudentRepository {
    ArrayList<Student> getStudents();

    Student addStudent(Student student);

    String addedMultipleOfStudents(ArrayList<Student> studentsList);

    Student getStudentById(int studentId);

    Student updateStudent(int studentId, Student student);

    void deleteStudent(int studentId);
}