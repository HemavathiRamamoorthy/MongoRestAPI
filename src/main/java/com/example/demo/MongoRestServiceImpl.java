package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class MongoRestServiceImpl implements MongoRestService {
	private final EmployeeRepository employeeRepository;
	@Autowired
	public MongoRestServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	@Override
	public List<Employee> getEmployee() {
		return (List<Employee>) employeeRepository.findAll();
	}

}
