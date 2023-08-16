/**
 * 
 */
package com.acybus.testApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 */
@RestController
public class TestController {
	
	@GetMapping(path = "/")
	public String getHome() {
		return " Hi Welcome to you in Acybus family. \n We can append nows";
	}
}
