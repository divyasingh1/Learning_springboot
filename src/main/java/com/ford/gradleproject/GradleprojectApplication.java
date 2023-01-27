package com.ford.gradleproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.ford.gradleproject")
@ComponentScan(basePackages = "com.ford.gradleproject")
public class GradleprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradleprojectApplication.class, args);
	}

}
