package book.chapter6.aop.tmp;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class GreetingBeforeAdvice implements MethodBeforeAdvice {
	public void before(Method method, Object[] args, Object obj) throws Throwable {
		String clientName = (String)args[0];
		System.out.print(obj.getClass().getName()+"."+method.getName() + "----");
		System.out.println("How are you fucker！Mr."+clientName+".");
	}
}
