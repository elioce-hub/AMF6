package com.example.amf.front.thymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class AmfFrontThymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmfFrontThymeleafApplication.class, args);
	}

}
