package com.pxd.test.demo05.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @Description BeanFacotryPostProcessorDemo
 * @Author rickypeng
 * @Date 2020/11/21
 */
//@Component
public class DemoBeanFacotryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("-------------进入DemoBeanFacotryPostProcessor-------------");
		String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
		System.out.println("-------------退出DemoBeanFacotryPostProcessor-------------");
	}
}
