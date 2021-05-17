package com.learn.learningapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	@GetMapping("/{number}")
	public String tableOfNumber(@PathVariable("number") String number) {
		System.out.println(number);
		String res = "";
		int num = Integer.parseInt(number);
		for(int i=1; i<= 10; i++) {
			res += num + " x " + i + " = " + num*i + "\n";
		}
		return res;
	}

}
