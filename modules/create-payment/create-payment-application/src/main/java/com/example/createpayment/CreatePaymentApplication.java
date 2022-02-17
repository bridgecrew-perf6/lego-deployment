package com.example.createpayment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.createpaymentmodule"})
public class CreatePaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreatePaymentApplication.class, args);
	}

}
