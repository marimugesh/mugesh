package com.tech.docmari.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DocController {
	@GetMapping(value="/data")
	public String getData() {
		return "Hello Team";
	}

}
