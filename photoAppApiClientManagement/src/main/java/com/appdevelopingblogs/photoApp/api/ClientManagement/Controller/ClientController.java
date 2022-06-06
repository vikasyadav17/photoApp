package com.appdevelopingblogs.photoApp.api.ClientManagement.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/client")
public class ClientController {
	
	@Autowired
	private Environment environment;
	
	@Autowired
	public ClientController(RestTemplate restTemplate) {
		this.environment=environment;
	}

	@GetMapping("/status/check")
	public String client() {
		
		return "from client";
	}

	@GetMapping("/account")
	public String account() {
		
		RestTemplate restTemplate = new RestTemplate();
		
		String uri = "http://localhost:9090/accounts/status/check";
		
		String result = restTemplate.getForObject(uri, String.class);
		
		return result;
		
	}
	
}


