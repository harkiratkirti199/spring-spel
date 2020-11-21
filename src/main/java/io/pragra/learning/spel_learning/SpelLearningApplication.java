package io.pragra.learning.spel_learning;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
@SpringBootApplication
public class SpelLearningApplication {
	public static ApplicationContext context;
	public static void main(String[] args) {
		context=(ApplicationContext) SpringApplication.run(SpelLearningApplication.class, args);
	
	
		
	}
	@GetMapping("/")
	public String getHomepage() {
		return context.getBean(String.class);
}

}
