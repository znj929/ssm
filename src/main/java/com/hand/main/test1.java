package com.hand.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hand.entity.Person;
/**
 * 通过xml注入bean
 * @author znj
 *
 */
public class test1 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-mvc.xml");
		
		Person person = (Person) context.getBean("person");
		System.out.print(person);
		
	}
}
