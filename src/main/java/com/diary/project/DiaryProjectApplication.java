package com.diary.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class DiaryProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiaryProjectApplication.class, args);
	}
	
	@GetMapping("/")
	public String main() {
		
		return "index";
	}
}
