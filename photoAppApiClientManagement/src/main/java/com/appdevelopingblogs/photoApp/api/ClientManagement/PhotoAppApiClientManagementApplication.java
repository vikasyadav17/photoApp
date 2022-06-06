package com.appdevelopingblogs.photoApp.api.ClientManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class PhotoAppApiClientManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoAppApiClientManagementApplication.class, args);
	}

	
	@Bean
	public RestTemplate restTempalte() {
		return new RestTemplate();
		
	}
	
}
