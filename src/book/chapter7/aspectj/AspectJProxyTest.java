package book.chapter7.aspectj;

import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

public class AspectJProxyTest {
	public static void main(String[] args) {
		Waiter waiter = new NaiveWaiter();
		
		AspectJProxyFactory factory = new AspectJProxyFactory();
		
		factory.setTarget(waiter);
		
		factory.addAspect(PreGreetAspect.class);
		
		Waiter proxy = factory.getProxy();
	
		proxy.greetTo("linuo");
		proxy.serveTo("linuoo");
	}
}
