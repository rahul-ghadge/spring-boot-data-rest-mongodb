package com.spring.data.rest.mongo.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.spring.data.rest.mongo.demo.model.Employee;

//@RepositoryRestResource(path="members")
public interface EmployeeRepository extends MongoRepository<Employee, String> {
	
	@RestResource(path = "find-by-name")
	Employee findByFirstName(String firstName);

}
