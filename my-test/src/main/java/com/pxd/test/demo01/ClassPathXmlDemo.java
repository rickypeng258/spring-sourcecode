package com.pxd.test.demo01;

import com.pxd.test.demo01.entity.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: Test
 * @author: rickypeng
 * @date: 2020/6/8
 */
public class ClassPathXmlDemo {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Person person = context.getBean(Person.class);
		System.out.println(person);
	}
}
