package review;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class GreetAdvise implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("how are you");
	}

}
