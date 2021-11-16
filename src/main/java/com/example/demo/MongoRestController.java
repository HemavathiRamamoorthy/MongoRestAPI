package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MongoRestController {
	
	private final MongoRestService mongoRestService;
	@Autowired
	MongoRestController(MongoRestService mongoRestService)
	{
		this.mongoRestService=mongoRestService;
	}
	@GetMapping(value = "/getEmployee")
	public List<Employee> getEmployee()
	{
		return mongoRestService.getEmployee();
	}
}
