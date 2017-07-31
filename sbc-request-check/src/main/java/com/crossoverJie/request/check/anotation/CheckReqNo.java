package com.crossoverJie.request.check.anotation;

import java.lang.annotation.*;

//作用于方法
@Target(ElementType.METHOD)

//在运行时可以通过反射来获取。
@Retention(RetentionPolicy.RUNTIME)

//用于生成JavaDoc文档
@Documented
public @interface CheckReqNo {
}
