package book.chapter6.aop.advise;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class ExceptionAdvisor implements ThrowsAdvice {
	public void afterThrowing(Method method, Object[] args, Object obj, RuntimeException ex){
		System.out.println("throwing");
	}
}
