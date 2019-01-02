package com.bigorg.EmployeeManagement;

import com.bigorg.EmployeeManagement.model.Employee;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@MappedTypes(Employee.class)
@MapperScan("com.bigorg.EmployeeManagement.mapper")
@SpringBootApplication
@EnableSwagger2
public class EmployeeManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);
	}

}

