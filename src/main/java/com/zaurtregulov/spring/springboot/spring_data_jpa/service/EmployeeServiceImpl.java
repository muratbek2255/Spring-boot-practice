package com.zaurtregulov.spring.springboot.spring_data_jpa.service;

import com.zaurtregulov.spring.springboot.spring_data_jpa.repository.EmployeeRepository;
import com.zaurtregulov.spring.springboot.spring_data_jpa.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

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
        Employee employee1 = null;
        Optional<Employee> employee = employeeRepository.findById(id);
        if(employee.isPresent()){
            employee1 = employee.get();
        }
        return employee1;
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }
}