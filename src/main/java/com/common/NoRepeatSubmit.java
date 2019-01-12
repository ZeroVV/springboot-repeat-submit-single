package com.common;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // 作用到方法上
@Retention(RetentionPolicy.RUNTIME) // 运行时有效
/**
 *
 * Description: 防止重复提交标记注解

 * @auther: OVER
 * @date: 2019/1/11
 */
public @interface NoRepeatSubmit {
}
