package com.pxd.test.demo01.processor;

import com.pxd.test.demo01.entity.Person;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @description: DemoBeanPostProcessor
 * @author: rickypeng
 * @date: 2020/7/22
 */
//@Component
//public class DemoBeanPostProcessor implements BeanPostProcessor {
//	@Override
//	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//		if (bean instanceof Person) {
//			System.out.println("beanpostprocessor-before-学生姓名:" + ((Person) bean).getName());
//		}
//		System.out.println("beanpostprocessor-before:" + beanName);
//		return bean;
//	}
//
//	@Override
//	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//		if (bean instanceof Person) {
//			((Person) bean).setName("pengxingdong");
//		}
//		System.out.println("beanpostprocessor-after:" + beanName);
//		return null;
//	}
//}
