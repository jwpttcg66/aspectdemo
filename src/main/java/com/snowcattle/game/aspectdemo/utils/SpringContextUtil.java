package com.snowcattle.game.aspectdemo.utils;

import org.springframework.context.ApplicationContext;

/**
 * 获取上下文工具类
 * @author lmq
 *
 */
public class SpringContextUtil {
    private static ApplicationContext applicationContext;

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public static void setApplicationContext(ApplicationContext applicationContext) {
        SpringContextUtil.applicationContext = applicationContext;
    }

    //返回指定bean的实例
    public static Object getBean(String beanId) {
        return applicationContext.getBean(beanId);
    }
}
