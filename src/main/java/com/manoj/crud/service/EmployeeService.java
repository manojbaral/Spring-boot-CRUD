package com.manoj.crud.service;

import com.manoj.crud.entity.Employee;

import java.util.List;

/**
 * Created by Manoj Baral on 11/22/2020.
 */
public interface EmployeeService {

    public List<Employee> findAll();

    public Employee findById(int theId);

    public void save(Employee theEmployee);

    public void deleteById(int theId);

}
