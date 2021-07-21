package com.pxd.test.demo05.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

/**
 * @description: DemoEvent
 * @author: rickypeng
 * @date: 2021/1/5
 */
public class DemoEvent extends ApplicationEvent {

	private static final long serialVersionUID = 1L;

	private String msg;

	/**
	 * Create a new ApplicationEvent.
	 *
	 * @param source the object on which the event initially occurred (never {@code null})
	 */
	public DemoEvent(Object source) {
		super(source);
	}

	public DemoEvent(Object source, String msg) {
		this(source);
		this.msg = msg;
	}

	public String getMsg() {
		return this.msg;
	}
}
