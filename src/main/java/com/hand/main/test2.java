package com.hand.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hand.config.MainConfig;

/**
 * 通过@Bean注解
 * 
 * @author znj
 *
 */
public class test2 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(
				MainConfig.class);
		String[] names = app.getBeanDefinitionNames();

		for (String name : names) {
			System.out.println(name);
		}

	}
}
