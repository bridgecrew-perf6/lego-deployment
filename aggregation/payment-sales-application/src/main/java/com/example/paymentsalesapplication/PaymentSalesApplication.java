package com.example.paymentsalesapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
		"com.example.createpaymentmodule",
		"com.example.refundpaymentmodule"
})
public class PaymentSalesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentSalesApplication.class, args);
	}

}
