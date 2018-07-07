package com.sankethomeprojects.microserviceslesson1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MicroservicesLesson1Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesLesson1Application.class, args);
	}
	
	@RequestMapping(path="/",method=RequestMethod.GET)
	public String greetings() {
		return "Hello World!";
	}
}
