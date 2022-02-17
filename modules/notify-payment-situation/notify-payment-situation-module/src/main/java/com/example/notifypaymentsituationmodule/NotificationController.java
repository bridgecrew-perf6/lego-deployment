package com.example.notifypaymentsituationmodule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/notify")
@RestController
public class NotificationController {

	private static final Logger LOG = LoggerFactory.getLogger(NotificationController.class);

	@PostMapping(path = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void sendNotification(@PathVariable("id") Integer id) {
		LOG.info("Received notification request for id: '{}'", id);
	}
}
