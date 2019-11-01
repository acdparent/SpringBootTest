package com.security.controller;

import com.security.model.domain.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {
private static int i=0;
    @GetMapping("/employee/all")
    public List<Employee> getAllEmployeeData(){
        List<Employee> employeeList = new ArrayList<>();
        for(int j = i+100;j >=i;i++){
            Employee employee = new Employee(j, "employeeFirstName--"+j,
                    "employeeLastName--"+j);
            employeeList.add(employee);
        }

        return employeeList;

    }
}
