package com.tech.cloud.config.insurance.provider;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/insurance-provider")
public class SpringCloudConfigInsuranceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigInsuranceProviderApplication.class, args);
	}
	
	@GetMapping("/getAllPlans")
	public List<String> getInsurancePlans(){
		return Stream.of("Premium","Gold","Platinum").toList();
	}

}
