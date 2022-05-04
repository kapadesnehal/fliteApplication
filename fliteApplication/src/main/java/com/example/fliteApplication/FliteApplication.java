package com.example.fliteApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.example.fliteApplication" })
public class FliteApplication {

	public static void main(String[] args) {
		SpringApplication.run(FliteApplication.class, args);
	}

}
