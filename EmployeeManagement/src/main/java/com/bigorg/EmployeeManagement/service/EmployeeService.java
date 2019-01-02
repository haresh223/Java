package com.bigorg.EmployeeManagement.service;

import com.bigorg.EmployeeManagement.exception.EmployeeNotFoundException;
import com.bigorg.EmployeeManagement.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee getEmployee(String employeeId) throws EmployeeNotFoundException;

    List<Employee> getAllEmployees();
}
//API/ micro servises/rest api

//client -> service -> Resource <-> DAO (Database) -> returns response to resource
//
//HTTP is a stateless protocol.