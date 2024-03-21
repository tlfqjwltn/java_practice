package com.example.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// jsp 화면으로 보내는 컨트롤러
@Controller
public class Lesson01Ex03Controller {
	@RequestMapping("/lesson01/ex03")
	public String ex03() {
		return "lesson01/ex03"; // jsp view 경로
	}
}
