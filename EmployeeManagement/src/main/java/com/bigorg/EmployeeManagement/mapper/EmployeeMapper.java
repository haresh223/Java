package com.bigorg.EmployeeManagement.mapper;


import com.bigorg.EmployeeManagement.exception.EmployeeNotFoundException;
import com.bigorg.EmployeeManagement.model.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface EmployeeMapper {

    @Select("select * from employee where ")
    public Employee findEmployee(String employeeId) throws EmployeeNotFoundException;

   @Select("select * from employee")
   @Results(value = {
           @Result(property = "employeeId", column = "employee_id"),
           @Result(property = "firstName", column = "first_name")
   })
    List<Employee> getAllEmployees();
}
