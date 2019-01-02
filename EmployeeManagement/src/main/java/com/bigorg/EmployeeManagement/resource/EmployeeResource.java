package com.bigorg.EmployeeManagement.resource;

import com.bigorg.EmployeeManagement.exception.EmployeeNotFoundException;
import com.bigorg.EmployeeManagement.mapper.EmployeeMapper;
import com.bigorg.EmployeeManagement.model.Employee;
import com.bigorg.EmployeeManagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeResource implements EmployeeService {


    @Autowired
    private Employee employee; //lazy initialization
    // when ever an object is required, spring container will provide one for us


    private EmployeeMapper employeeMapper;

    public EmployeeResource(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }

    @Override
    @RequestMapping(method = RequestMethod.GET, value = "/getemployeebyid", produces = "application/json")
    @ResponseBody
    public Employee getEmployee(String employeeId) throws EmployeeNotFoundException {
        if(employeeId.equals("100-00-01")) {
            throw new EmployeeNotFoundException("Error: Invalid employee ID or employee id not found");
        }

        /*try {
            employee = employeeMapper.findEmployee(employeeId);
        }catch(EmployeeNotFoundException e) {
            e.printStackTrace();
        }*/

        //employee.setEmployeeId(employeeId);
        //employee.setFirstName("some name");
        ///employee.setDesignation("application developer");
        return employee;
    }

    @Override
    @RequestMapping(method = RequestMethod.GET, value = "/getallemployees", produces = "application/json")
    @ResponseBody
    public List<Employee> getAllEmployees() {
       return employeeMapper.getAllEmployees();
    }
}
