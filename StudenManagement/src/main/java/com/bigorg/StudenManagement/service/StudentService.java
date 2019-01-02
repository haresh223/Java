package com.bigorg.StudenManagement.service;

import com.bigorg.StudenManagement.exception.StudentNotFoundException;
import com.bigorg.StudenManagement.model.Student;

import java.util.List;


public interface StudentService
{
    Student getStudent(String studentID) throws StudentNotFoundException;

    // abstract method: a method which has only declaration and no implementation
    // all methods inside Interface are implicitly abstract

    // Try to create a method which returns multiple students.

    List<Student> getAllStudents() ;
}
