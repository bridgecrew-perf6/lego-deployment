package com.example.refundpayment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
		"com.example.refundpayment",
		"com.example.refundpaymentmodule"
})
public class RefundPaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(RefundPaymentApplication.class, args);
	}

}
