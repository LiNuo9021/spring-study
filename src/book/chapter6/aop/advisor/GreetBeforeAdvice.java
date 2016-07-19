package book.chapter6.aop.advisor;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class GreetBeforeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		System.out.println("welcome before greet");
	}

}
