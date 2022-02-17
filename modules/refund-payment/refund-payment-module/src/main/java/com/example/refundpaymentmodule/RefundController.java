package com.example.refundpaymentmodule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/refund")
@RestController
public class RefundController {

	private static final Logger LOG = LoggerFactory.getLogger(RefundController.class);

	@Autowired
	private NotificationAPI notificationAPI;

	@PostMapping(path = "/{id}")
	public void refund(@PathVariable("id") Integer id) {
		LOG.info("Received refund request for id:'{}'", id);
		this.notificationAPI.sendNotification(id);
	}
}
