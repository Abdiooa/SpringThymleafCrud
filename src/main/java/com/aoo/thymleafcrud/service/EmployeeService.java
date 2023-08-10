package com.aoo.thymleafcrud.service;

import com.aoo.thymleafcrud.model.Employee;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(Long id);
    void deleteEmployeeId(Long id);
    Page<Employee> findPaginated(int pageNo, int pageSize);

}