package com.pxd.test.demo05.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @description: DemoApplictionListener
 * @author: rickypeng
 * @date: 2021/1/5
 */
@Component
public class DemoApplictionListener implements ApplicationListener<DemoEvent> {
	@Override
	public void onApplicationEvent(DemoEvent event) {
		System.out.println(event.getMsg());
	}
}
