package com.xhsd.baseutils.secret.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>
 * 加解密注解
 * </p>
 *
 * @author guij
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Secret {

	// 请求解密的属性
	String[] reqPropsName();

	// 响应加密的属性
	String[] respPropsName() ;

}
