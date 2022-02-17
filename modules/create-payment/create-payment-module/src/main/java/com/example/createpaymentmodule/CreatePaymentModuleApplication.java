package com.example.createpaymentmodule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class CreatePaymentModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreatePaymentModuleApplication.class, args);
	}

}
