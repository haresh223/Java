package com.bigorg.StudenManagement.model;

import org.springframework.stereotype.Component;

@Component
public class Student {
  private String studentID;
  private String firstname;
  private String designation;

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getFirstname(String some_required_name) {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", firstname='" + firstname + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
