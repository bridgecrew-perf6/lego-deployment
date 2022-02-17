package com.example.notifypaymentsituation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = { "com.example.notifypaymentsituationmodule" })
public class NotifyPaymentSituationApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotifyPaymentSituationApplication.class, args);
	}

}
