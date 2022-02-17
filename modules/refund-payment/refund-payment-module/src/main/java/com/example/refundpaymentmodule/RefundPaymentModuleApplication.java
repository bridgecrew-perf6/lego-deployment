package com.example.refundpaymentmodule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class RefundPaymentModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RefundPaymentModuleApplication.class, args);
	}

}
