package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public interface MongoRestService {
	public List<Employee> getEmployee();
}
