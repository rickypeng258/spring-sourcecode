package com.pxd.test.demo04;

import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @description: EnableDemoConfiguration
 * @author: rickypeng
 * @date: 2020/7/21
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Import({DemoImportSelector.class})
public @interface EnableDemoConfiguration {
}
