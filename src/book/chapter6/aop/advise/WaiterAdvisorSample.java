package book.chapter6.aop.advise;

import org.springframework.aop.framework.ProxyFactory;

public class WaiterAdvisorSample {
	public static void main(String[] args) {
		
		Waiter waiter = new NaiveWaiter();
		
		ProxyFactory factory = new ProxyFactory();
		
		factory.setTarget(waiter);
		
		factory.addAdvice(new WaiterAdvisor());
		
		Waiter adviseWaiter = (Waiter)factory.getProxy();
	
		adviseWaiter.greetTo();
	}
	
}
