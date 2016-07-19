package review;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class GreetInterceptorAdvice implements MethodInterceptor{
	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		System.out.println("invoke before");
		Object obj = arg0.proceed();
		System.out.println("invoke after");
		return obj;
	}
}
