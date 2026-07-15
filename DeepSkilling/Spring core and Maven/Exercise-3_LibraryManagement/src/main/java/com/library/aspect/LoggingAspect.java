package com.library.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect{

    @Around("execution(* com.library.service.LibraryService.*(..))")

    public Object logExecutionTime(@NonNull ProceedingJoinPoint joinpoint) throws Throwable {
        long start = System.currentTimeMillis();

        System.out.println("Method Started");
        Object obj = joinpoint.proceed();

        long end = System.currentTimeMillis();

        System.out.println("Method Completed");

        System.out.println("Excetion Time: " + (end - start) + "ms");

        return obj;

    }
}

