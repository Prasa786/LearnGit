package com.spring.assignment17.banking;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogginAspect {


    @Before("execution(* com.springFrame.Assignment17."
    		+ "BankingApplication.Bank.*(..))")
    public void authenticate() {
        System.out.println("Authenticating user...");
    }

    @AfterThrowing(pointcut = "execution(* com.springFrame.Assignment17."
    		+ "BankingApplication.Bank.*(..))", throwing = "error")
    public void logError(Throwable error) {
        System.out.println("Error occurred: " + error.getMessage());
    }
}
