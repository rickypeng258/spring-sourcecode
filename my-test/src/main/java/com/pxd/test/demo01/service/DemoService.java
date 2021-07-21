package com.pxd.test.demo01.service;

import com.pxd.test.demo01.dao.DemoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * @Description DemoService
 * @Author rickypeng
 * @Date 2020/11/29
 */
@Service
@Lazy
public class DemoService {



	public void init() {
		System.out.println("-------------init-------------");
	}
	public void destroy() {
		System.out.println("-----------destroy--------------");
	}

	@Autowired
	private DemoDao demoDao;

	public String getStr() {
		return demoDao.findOne();
	}
}
