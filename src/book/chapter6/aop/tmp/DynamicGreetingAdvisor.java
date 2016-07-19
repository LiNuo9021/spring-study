package book.chapter6.aop.tmp;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.DynamicMethodMatcherPointcut;

public class DynamicGreetingAdvisor extends DynamicMethodMatcherPointcut{
	
	static List<String> argsList = new ArrayList<String>();
	
	static{
		argsList.add("linuo");
		argsList.add("li");
	}
	
	@Override
	public boolean matches(Method method, Class<?> targetClass, Object[] args) {
		return argsList.contains(args[0]);//编程的一刻，已经知道这里只有1个参数了
	}
	
	@Override
	public boolean matches(Method method, Class<?> targetClass) {
		return method.getName().equals("serveTo");
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
