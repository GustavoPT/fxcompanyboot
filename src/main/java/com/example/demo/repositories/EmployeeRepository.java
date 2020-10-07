package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Employee;

// interface and query the employee repository then in controller 

public interface EmployeeRepository extends CrudRepository<Employee,String> {
	
	

}
