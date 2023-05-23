package com.diary.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class DiaryProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiaryProjectApplication.class, args);
	}
	
	@RequestMapping("/")
	public String root() {
		
		return "index";
	}

}
