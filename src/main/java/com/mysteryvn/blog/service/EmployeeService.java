package com.mysteryvn.blog.service;

import com.mysteryvn.blog.model.Employee;

import java.util.List;

public interface EmployeeService {

    /**
     * Get All Employees.
     *
     * @return List<Employee>
     */
    public List<Employee> getAllEmployees();

    /**
     * Save Employee.
     *
     * @param employee Employee
     * @return Employee
     */
    public Employee saveEmployee(Employee employee);

    /**
     * Get Employee By Id.
     *
     * @param id long
     * @return Employee
     */
    public Employee getEmployeeById(long id);

    /**
     * Delete Employee By Id.
     *
     * @param id long
     * @return void
     */
    public void deleteEmployeeById(long id);
}
