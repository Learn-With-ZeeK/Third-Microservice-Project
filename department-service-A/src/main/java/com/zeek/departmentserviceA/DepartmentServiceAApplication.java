package com.zeek.departmentserviceA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DepartmentServiceAApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentServiceAApplication.class, args);
	}

}
