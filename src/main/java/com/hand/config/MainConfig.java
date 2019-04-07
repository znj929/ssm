package com.hand.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hand.entity.Person;

//配置类
@Configuration
public class MainConfig {
	@Bean(name="person02")
	public Person person01() {	
		return new Person("znj","20");
	}
}
