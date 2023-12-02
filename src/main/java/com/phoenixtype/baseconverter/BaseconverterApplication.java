package com.phoenixtype.baseconverter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class BaseconverterApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaseconverterApplication.class, args);
	}
}
