package com.example.demo;

import org.bson.types.ObjectId;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, ObjectId>{

}
