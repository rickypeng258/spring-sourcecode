package com.pxd.test.demo03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: MyBatisConfiguration
 * @author: rickypeng
 * @date: 2020/7/21
 */
@Configuration
public class DemoConfiguration {

	@Bean
	public DemoSqlSessionFactory getStSqlSessiontFactory() {
		return new DemoSqlSessionFactory();
	}
}
