package com.abhijeet.springaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {
	public void logBeforeAllMethods(JoinPoint jp) throws Throwable {
		System.out.println("****LoggingAspect.logBeforeAllMethods() " + jp.getSignature().getName());
	}

	public void logAfterAllMethods(JoinPoint jp) throws Throwable {
		System.out.println("****LoggingAspect.logAfterAllMethods() " + jp.getSignature().getName());
	}

	public void logAfterReturningAllMethods(JoinPoint jp) throws Throwable {
		System.out.println("****LoggingAspect.logAfterReturningAllMethods() " + jp.getSignature().getName());
	}

	public void logAfterThrowingAllMethods(JoinPoint jp) throws Throwable {
		System.out.println("****LoggingAspect.logAfterThrowingAllMethods() " + jp.getSignature().getName());
	}

	public Object logAroundAllMethods(ProceedingJoinPoint jp) throws Throwable {
		long start = System.currentTimeMillis();
		System.out.println("****LoggingAspect.logAroundAllMethods() " + jp.getSignature().getName());
		Object result = jp.proceed();
		long end = System.currentTimeMillis();
		System.out.println("The method took " + (end - start) + " milliseconds.");

		return result;
	}

	public void logAllMethods(JoinPoint jp, String userID, String password) throws Throwable {
		System.out.println("****LoggingAspect.logAllMethods() " + jp.getSignature().getName() + " : " + userID);
	}
}