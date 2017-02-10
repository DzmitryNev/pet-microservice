package com.shop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StartController {

	@RequestMapping("/")
	public String name() {
		return "forward:/Shop.html";
	}
}
