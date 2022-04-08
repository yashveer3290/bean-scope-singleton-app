package com.sunglowsys.service;

import com.sunglowsys.domain.Address;
import com.sunglowsys.domain.Employee;
import com.sunglowsys.repository.EmployeeRepository;
import com.sunglowsys.repository.EmployeeRepositoryImpl;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();

    @Override
    public Employee save(Employee employee) {
      return employeeRepository.save(employee);
    }

    @Override
    public Employee update(Employee employee, Long id) {
        return  null;
    }

    @Override
    public List<Employee> findAll() {
        return null;
    }

    @Override
    public Employee findById(Long id) {
        return  null;
    }

    @Override
    public void delete(Long id) {

    }

}

