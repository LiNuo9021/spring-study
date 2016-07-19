package book.chapter6.aop.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;


public class CGLibProxy implements MethodInterceptor{

	private Enhancer enhancer = new Enhancer();
	
	public Object getProxy(Class clazz){
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		return enhancer.create();
	}
	
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		PerformanceMonitor.begin(method.getName());

		Object returnObj = proxy.invokeSuper(obj, args);//这里一定是super
		
		PerformanceMonitor.end(method.getName());
		
		return returnObj;
	}
}
