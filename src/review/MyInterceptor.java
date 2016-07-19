package review;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class MyInterceptor implements MethodInterceptor {

	private Enhancer enhancer = new Enhancer();
	
	public Object create(Class clazz){
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		return enhancer.create();
	}
	
	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2,
			MethodProxy arg3) throws Throwable {
		System.out.println("begin");

		Object returnObj = arg3.invokeSuper(arg0, arg2);

		System.out.println("end");
	
		return returnObj;
	}

}
