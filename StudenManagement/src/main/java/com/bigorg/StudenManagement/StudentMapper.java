package com.bigorg.StudenManagement;

import com.bigorg.StudenManagement.exception.StudentNotFoundException;
import com.bigorg.StudenManagement.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StudentMapper {
    @Select("select * from student where ")
    public Student findEmployee(String employeeId) throws StudentNotFoundException;

}
