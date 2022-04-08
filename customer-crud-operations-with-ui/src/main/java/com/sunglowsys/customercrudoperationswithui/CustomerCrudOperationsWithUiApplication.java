package com.sunglowsys.customercrudoperationswithui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@SpringBootApplication
@EntityScan(basePackages = "com.sunglowsys.domain")
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.sunglowsys.repository")
public class CustomerCrudOperationsWithUiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerCrudOperationsWithUiApplication.class, args);
	}

}


