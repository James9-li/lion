package com.james.lion.log;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Created by james.li on 2015-03-09 14:21:23.
 */
@Component
@Aspect
@Slf4j
public class ExceptionLog {
    @AfterThrowing(pointcut = "execution(public * com.james.lion.biz..*(..))", throwing = "ex")
    public void log(Exception ex) {
        log.error("ExceptionLog", ex);
    }
}
