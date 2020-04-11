package com.cooligc.labs.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class ZipkinApiTracingPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinApiTracingPocApplication.class, args);
	}
}
