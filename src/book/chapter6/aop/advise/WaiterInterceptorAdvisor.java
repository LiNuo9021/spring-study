package book.chapter6.aop.advise;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class WaiterInterceptorAdvisor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		System.out.println("hello from manager");
		
		Object obj = methodInvocation.proceed();
		
		System.out.println("goodbye from manager");
		
		return obj;
	}

}
