package book.chapter6.aop.advisor;

import java.lang.reflect.Method;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcutAdvisor;

public class GreetAdvisor extends StaticMethodMatcherPointcutAdvisor {

	@Override
	public boolean matches(Method method, Class<?> targetClass) {
		return "greet".equals(method.getName());
	}
	
	@Override
	public ClassFilter getClassFilter() {
		return new ClassFilter() {
			@Override
			public boolean matches(Class<?> clazz) {
				return clazz.isAssignableFrom(Waiter.class);
			}
		};
	}

}
