package com.example.testproj2.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(path = "api/v1/testproj2")
public class Testproj2Controller {
    
    @GetMapping("returnMessage")
	public String returnMessage() {
		return "API online.";
	}

}
