package com.appdevelopingblogs.photoApp.api.accountManagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountController {
	
	
	@GetMapping(path="/status/check")
	public String accountStatus() {
		return "Account management microservice is working";
		
	}

}
