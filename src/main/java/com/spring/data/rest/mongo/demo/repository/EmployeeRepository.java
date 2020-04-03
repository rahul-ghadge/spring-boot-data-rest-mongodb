package com.spring.data.rest.mongo.demo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.spring.data.rest.mongo.demo.model.Employee;

//@RepositoryRestResource(path="members")
public interface EmployeeRepository extends MongoRepository<Employee, String> {
	
	
	// http://localhost:8080/employees/search/find-by-name?firstName=Rahul
	@RestResource(path = "find-by-name")
	Employee findByFirstName(String firstName);
	
	
	// http://localhost:8080/employees/search/nameStartsWith?name=Ran
	@RestResource(path = "nameStartsWith", rel = "nameStartsWith")
	public Page<Employee> findByFirstNameStartsWith(@Param("name") String name, Pageable p);

}
