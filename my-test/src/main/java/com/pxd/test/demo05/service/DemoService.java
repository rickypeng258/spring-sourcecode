package com.pxd.test.demo05.service;

import com.pxd.test.demo05.annotation.DemoAnnotation;
import org.springframework.stereotype.Service;

/**
 * @Description StudyService
 * @Author rickypeng
 * @Date 2020/11/21
 */
@Service
public class DemoService {

	@DemoAnnotation
	public void study() {
		System.out.println("学习");
	}

	@DemoAnnotation
	public String doThing(String str) {
		return str;
	}
}
