package com.pxd.test.demo05.annotation;

import java.lang.annotation.*;

/**
 * @description: DemoAnnotation
 * @author: rickypeng
 * @date: 2021/1/6
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DemoAnnotation {
}
