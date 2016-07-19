package review;

import java.lang.reflect.Proxy;

public class TestFuck {
	public static void main(String[] args){
//		XService service = new XServiceImpl();
//
//		FuckHandler handler = new FuckHandler(service);
//
//		XService proxy 
//			= (XService)Proxy.newProxyInstance(service.getClass().getClassLoader(), 
//					service.getClass().getInterfaces(), 
//					handler);
//		
//		proxy.fuck(1000l);
		
		MyInterceptor interceptor = new MyInterceptor();
		XServiceImpl serviceProxy = 
				(XServiceImpl)interceptor.create(XServiceImpl.class);
		
		serviceProxy.fuck(1000l);
		
	}
}
