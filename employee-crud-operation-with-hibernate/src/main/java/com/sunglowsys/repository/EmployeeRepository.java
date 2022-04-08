package com.sunglowsys.repository;
import com.sunglowsys.domain.Employee;

import java.util.List;

public interface EmployeeRepository {

    Employee save(Employee employee);

    Employee update(Employee employee, Long id);

    List<Employee>findAll();

    Employee findById(Long id);

    void delete(Long id);
}
