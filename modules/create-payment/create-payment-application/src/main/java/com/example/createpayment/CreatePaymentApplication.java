package com.example.createpayment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication(scanBasePackages = {"com.example.createpaymentmodule"})
public class CreatePaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreatePaymentApplication.class, args);
	}

}
