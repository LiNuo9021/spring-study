package review;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class FuckHandler implements InvocationHandler {
	private Object target;
	public FuckHandler(Object target){
		this.target = target;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("begin");

		Object returnObj = method.invoke(target, args);

		System.out.println("end");
	
		return returnObj;
	}

}
