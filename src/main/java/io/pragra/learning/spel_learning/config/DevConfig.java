package io.pragra.learning.spel_learning.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:app.properties")

public class DevConfig {
	
	@Value("#{${page.mood} < 20 ? 'index' : 'dev'}")
	private String page;

	@Value("${student.name}")
	private String name;
	
	
	@Bean
	public String pageName() {
		System.out.println(name);
		return page;
	}

}
