package com.example.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class quiz03 {
	@RequestMapping("/lesson01/quiz03")
	public String ex03() {
		return "lesson01/quiz03";
	}
}
