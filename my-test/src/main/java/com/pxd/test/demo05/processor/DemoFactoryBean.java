package com.pxd.test.demo05.processor;

import com.pxd.test.demo05.controller.DemoController;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Description DemoFactoryBean
 * @Author rickypeng
 * @Date 2020/11/29
 */
public class DemoFactoryBean implements FactoryBean<DemoController> {
	@Override
	public DemoController getObject() throws Exception {
		return new DemoController();
	}

	@Override
	public Class<?> getObjectType() {
		return DemoController.class;
	}
}
