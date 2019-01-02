package com.bigorg.StudenManagement.resource;

import com.bigorg.StudenManagement.StudentMapper;
import com.bigorg.StudenManagement.exception.StudentNotFoundException;
import com.bigorg.StudenManagement.model.Student;
import com.bigorg.StudenManagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Student")
public class StudentResource implements StudentService {

    @Autowired
    private Student student;   // object creation

     private StudentMapper studentMapper;

        public StudentResource (StudentMapper employeeMapper) {
            this.studentMapper = employeeMapper;
        }
    @Override
    @RequestMapping(method = RequestMethod.GET, value = "/getstudentbyid", produces = "application/json")
    @ResponseBody
    public Student getStudent(String studentID) throws StudentNotFoundException {
        if(studentID.equals("200-00-01"));
        {
            throw new StudentNotFoundException("Error: Invalid student ID or student id not found");
        }
        try {
            student = studentMapper.findStudent(studentID);
        } catch(StudentNotFoundException e)    {
            e.printStackTrace();
        }

//        student.setStudentID("200-00-01");
//        student.getFirstname("some required name");
//        student.setDesignation("application developer");
       return student;
    }





}
