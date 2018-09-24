package com.zy.traval.common.annotion;

import org.springframework.core.annotation.AliasFor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.annotation.*;

/**
 * @author cgl
 * @CreateTime 2018/7/7
 * @Update
 * @copyright 上海孟伯智能版权所有
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@RequestMapping
@ResponseBody
public @interface RestMapping {
    @AliasFor("path")
    String[] value() default {};


    @AliasFor("value")
    String[] path() default {};

}
