package io.javabeans.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class HelloController {  
	@RequestMapping("/hello")
	public String sayHi() {
		return "Welcome to Spring Boot";
	}

	@RequestMapping("/hi")
	public String sdfsdf() {
		return "sadfasdfsf to Spring Boot";
	}

}
