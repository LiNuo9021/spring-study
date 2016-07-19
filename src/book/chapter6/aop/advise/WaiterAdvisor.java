package book.chapter6.aop.advise;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class WaiterAdvisor implements MethodBeforeAdvice {
	@Override
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		System.out.println("welcome");
//		method.invoke(target, args);
	}
}
