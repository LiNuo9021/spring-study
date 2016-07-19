package book.chapter6.aop.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PerformanceHandler implements InvocationHandler{
	
	private Object target;
	public PerformanceHandler(Object target) {
		this.target = target;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		PerformanceMonitor.begin(method.getName());
		
		Object returnObj = method.invoke(target, args);
		
		PerformanceMonitor.end(method.getName());
		
		return returnObj;
	}
}
