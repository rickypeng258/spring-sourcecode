package com.pxd.test.demo04;

import com.pxd.test.demo02.RedisConfiguration;
import com.pxd.test.demo03.DemoConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @description: DemoImportSelector
 * @author: rickypeng
 * @date: 2020/7/21
 */
public class DemoImportSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[] {DemoConfiguration.class.getName(), RedisConfiguration.class.getName()};
	}
}
