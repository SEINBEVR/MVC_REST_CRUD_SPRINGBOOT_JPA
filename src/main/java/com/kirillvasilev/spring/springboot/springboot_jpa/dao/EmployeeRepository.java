package com.kirillvasilev.spring.springboot.springboot_jpa.dao;





import com.kirillvasilev.spring.springboot.springboot_jpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
        public List<Employee> findAllByName(String name);
}
