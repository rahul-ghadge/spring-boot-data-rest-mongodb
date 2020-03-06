package com.spring.data.rest.mongo.demo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.spring.data.rest.mongo.demo.model.Employee;
import com.spring.data.rest.mongo.demo.repository.EmployeeRepository;
import com.spring.data.rest.mongo.demo.utils.HelperUtil;

@SpringBootApplication
@EnableMongoAuditing
@EnableWebMvc
public class SpringBootDataRestApplication implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootDataRestApplication.class);

	@Autowired
	private EmployeeRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataRestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Employee emp = repo.findByFirstName("Rahul");

		LOGGER.info("-----------------------------------------------");
		LOGGER.info("Employee:: {}", emp);
		LOGGER.info("-----------------------------------------------");
		
		if (null == emp) {
			List<Employee> employees = repo.saveAll(HelperUtil.getStaticEmployee());
			if (null != employees && employees.size() > 0) {
				LOGGER.info("-----------------------------------------------");
				LOGGER.info("Employee data saved in MongoDB");
				LOGGER.info("{} employees saved", employees.size());
				LOGGER.info("-----------------------------------------------");
			}
		} else {
			LOGGER.info("-----------------------------------------------");
			LOGGER.info("Employee data is already present MongoDB");
			LOGGER.info("-----------------------------------------------");
		}

	}

}
