package com.snowcattle.game.aspectdemo;

import com.snowcattle.game.aspectdemo.utils.AnnotationUtils;
import javassist.NotFoundException;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
@Aspect
public class LogAspect {

    private Logger logger = LoggerFactory.getLogger(LogAspect.class);

    @Pointcut("execution(* com.snowcattle.game.aspectdemo.service..*(..))")
    private void pointcut() {
        System.out.println("do");
    }

    @After(value = "pointcut()")
    public void After(JoinPoint joinPoint) throws NotFoundException, ClassNotFoundException {
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
//        Object[] args = joinPoint.getArgs();
//        Class<?> targetClass = Class.forName(className);
//        Method[] methods = targetClass.getMethods();
//        for (Method method : methods) {
//            if (method.getName().equalsIgnoreCase(methodName)) {
//                Class<?>[] clazzs = method.getParameterTypes();
//                if (clazzs.length == args.length) {
//                    Log logAnnotation = method.getAnnotation(Log.class);
//                    if (logAnnotation != null) {
//                        String logStr = logAnnotation.logStr();
//                        logger.error("获取日志：" + logStr);
//                        // 数据库记录操作...
//                        break;
//                    }
//                }
//            }
//        }
        String logStr = AnnotationUtils.get().getAnnotatioinFieldValue(className, methodName, Log.class.getName(), "logStr");
        if (!StringUtils.isEmpty(logStr)) {
            logger.error("获取日志：" + logStr);
            // 数据库记录操作...
        }
        System.out.println("记录日志");
    }
}
