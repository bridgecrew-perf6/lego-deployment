package com.example.notifypaymentsituationmodule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class NotifyPaymentSituationModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotifyPaymentSituationModuleApplication.class, args);
	}

}
