package org.duke.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

    //Here we add our related advices for logging

    //Let's start with an @Before advice
    //Provide full package name for matching to specific class methods.
    @Before("execution(public void add*())")
    public void beforeAddAccountAdvice(){
        System.out.println("\n ========>> Executing @Before advice on addAccount()");
    }

    //Specifying access modifiers are optional and hence can be skipped
    @Before("execution(boolean returns*())")
    public void beforeReturnsBooleanAdvice(){
        System.out.println("\n ========>> Executing @Before advice on returnsBoolean()");
    }

    //And this will match on any return type
    @Before("execution(* add*())")
    public void beforeMatchAny(){
        System.out.println("\n ========>> Executing @Before advice on any method with name add*()");
    }
}
