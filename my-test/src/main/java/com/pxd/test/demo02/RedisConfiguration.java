package com.pxd.test.demo02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: RedisConfiguration
 * @author: rickypeng
 * @date: 2020/7/21
 */
@Configuration
public class RedisConfiguration {

	@Bean
	public StRedisTemplate getStRedisTemplate() {
		return new StRedisTemplate();
	}
}
