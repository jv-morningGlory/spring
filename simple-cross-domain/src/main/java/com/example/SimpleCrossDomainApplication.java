package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = "com.example")
public class SimpleCrossDomainApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleCrossDomainApplication.class, args);
	}

}
