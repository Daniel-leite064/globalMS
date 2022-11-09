package com.example.globalMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.fiap.globalMS.controllers"})
@EnableJpaRepositories("com.fiap.globalMS.repositories")
public class GlobalMSApplication {

	public static void main(String[] args) {
		SpringApplication.run(GlobalMSApplication.class, args);
	}

}
