package com.diary.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/calendar")
public class DiaryController {
	
	@RequestMapping
	public String calendar() {
		
		return "calendar";
	}
}
