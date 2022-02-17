package com.example.createpaymentmodule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RequestMapping("/payment")
@RestController
public class CreatePaymentController {

	private static final Logger LOG = LoggerFactory.getLogger(CreatePaymentController.class);

	@Autowired
	private NotificationAPI notificationAPI;

	@PostMapping
	public void refund() {
		int randomId = new Random().ints(1, 100_000).findFirst().getAsInt();
		LOG.info("Received payment creation request for id:'{}'", randomId);
		this.notificationAPI.sendNotification(randomId);
	}
}
