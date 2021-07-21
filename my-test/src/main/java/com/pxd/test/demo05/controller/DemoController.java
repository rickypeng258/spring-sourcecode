package com.pxd.test.demo05.controller;

import com.pxd.test.demo05.annotation.DemoAnnotation;
import com.pxd.test.demo05.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * @Description StudyController
 * @Author rickypeng
 * @Date 2020/11/21
 */
@Controller
@Lazy
public class DemoController {

	public DemoController() {
		System.out.println("---------------实例化DemoController-----------B");
	}

	@Autowired
	private DemoService demoService;

	public void study() {
		demoService.study();
	}

	public void doThing() {
		System.out.println(demoService.doThing("测试切面使用"));
	}
}
