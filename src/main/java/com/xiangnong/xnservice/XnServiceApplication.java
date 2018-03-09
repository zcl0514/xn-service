package com.xiangnong.xnservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class XnServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(XnServiceApplication.class, args);
	}

	@RequestMapping("/")
	public String index() {
		return "main";
	}
}
