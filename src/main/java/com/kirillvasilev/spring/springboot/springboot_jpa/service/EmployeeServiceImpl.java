package com.kirillvasilev.spring.springboot.springboot_jpa.service;



import com.kirillvasilev.spring.springboot.springboot_jpa.dao.EmployeeRepository;
import com.kirillvasilev.spring.springboot.springboot_jpa.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {

        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {

        employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployee(int id) {
        Employee employee = null;
        Optional<Employee> emp = employeeRepository.findById(id);
        if(emp.isPresent()) {
            employee = emp.get();
        }
        return employee;
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> findAllByName(String name) {
        List<Employee> emps = employeeRepository.findAllByName(name);
        return emps;
    }
}
