package com.sunglowsys.test;

import com.sunglowsys.domain.Address;
import com.sunglowsys.domain.Employee;
import com.sunglowsys.service.EmployeeService;
import com.sunglowsys.service.EmployeeServiceImpl;

public class SaveEmployee {
    public static void main(String[] args) {

        Address address = new Address("Bhavan", "Nagar", "Marehra", "UP", "207401");
        Employee employee = new Employee("Yash", "Veer", "yash011997@gmail.com", "7505943290");
        employee.setAddress(address);
        EmployeeService employeeService = new EmployeeServiceImpl();
        Employee result = employeeService.save(employee);
        System.out.println(result);


    }
}
