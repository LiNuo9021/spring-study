package book.chapter6.aop.advise;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class WaiterAfterAdvisor implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method,
			Object[] args, Object target) throws Throwable {
		System.out.println("good bye");
	}

}
