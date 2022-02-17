package com.example.createpaymentmodule;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "createPaymentNotificationApi", url = "${custom.notifications.feign.url}")
public interface NotificationAPI {

	@PostMapping(path = "/notify/{id}")
	public void sendNotification(@PathVariable("id") Integer id);
}

