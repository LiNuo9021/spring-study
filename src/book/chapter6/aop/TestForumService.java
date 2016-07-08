package book.chapter6.aop;

import java.lang.reflect.Proxy;


public class TestForumService {
	public static void main(String[] args) throws SecurityException, NoSuchMethodException, Throwable {
		ForumService fs = new ForumServiceImpl();
//		fs.removeTopic(3000);
		
		//----------JDK动态代理----------
//		PerformanceHandler handler = new PerformanceHandler(fs);
////		handler.invoke(null, fs.getClass().getMethod("removeTopic", int.class), new Object[]{3000});
//		
//		ForumService proxyForumService = 
//				(ForumService)Proxy.newProxyInstance(fs.getClass().getClassLoader(), fs.getClass().getInterfaces(), handler);
//		
//		proxyForumService.removeTopic(3000);
//		
		
		//----------CGLib动态代理----------
		CGLibProxy cgLibProxy = new CGLibProxy();
		ForumService proxy = (ForumService)cgLibProxy.getProxy(ForumServiceImpl.class);
		proxy.removeTopic(2000);
	}
}



