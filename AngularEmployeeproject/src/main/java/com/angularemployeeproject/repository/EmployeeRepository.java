package com.angularemployeeproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.angularemployeeproject.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
	
	Employee findByName(String name);

}
