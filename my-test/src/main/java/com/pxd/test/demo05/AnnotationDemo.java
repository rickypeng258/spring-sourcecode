package com.pxd.test.demo05;

import com.pxd.test.demo03.DemoSqlSessionFactory;
import com.pxd.test.demo04.EnableDemoConfiguration;
import com.pxd.test.demo05.controller.DemoController;
import com.pxd.test.demo05.event.DemoEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Description AnnotationDemo
 * @Author rickypeng
 * @Date 2020/11/21
 */
@EnableDemoConfiguration
@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class AnnotationDemo {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnnotationDemo.class);
		System.out.println("----------------获取DemoController---------------");
		String[] beanNames = applicationContext.getBeanDefinitionNames();
		DemoController demoController = applicationContext.getBean(DemoController.class);
		DemoSqlSessionFactory demoSqlSessionFactory = applicationContext.getBean(DemoSqlSessionFactory.class);
		System.out.println(demoSqlSessionFactory.build());
		applicationContext.publishEvent(new DemoEvent("abc", "测试事件监听机制"));
		demoController.study();
	}
}
