package com.example.test_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TestAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestAppApplication.class, args);
	}

}
