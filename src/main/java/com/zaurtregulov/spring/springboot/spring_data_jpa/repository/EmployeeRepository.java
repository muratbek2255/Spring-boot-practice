package com.zaurtregulov.spring.springboot.spring_data_jpa.repository;

import com.zaurtregulov.spring.springboot.spring_data_jpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}