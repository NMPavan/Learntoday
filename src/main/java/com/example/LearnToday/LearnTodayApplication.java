package com.example.LearnToday;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LearnTodayApplication {

	
	@Bean
	public ModelMapper mapper() {
		return new ModelMapper();
	}
	public static void main(String[] args) {
		SpringApplication.run(LearnTodayApplication.class, args);
	}

}
