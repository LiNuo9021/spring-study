package book.chapter6.aop.advise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class WaiterAdvisorSample2 {
	public static void main(String[] args) {
		ApplicationContext ac 
			= new GenericXmlApplicationContext("classpath:book/chapter6/aop/advise/advise.xml");
		
		Waiter proxyWaiter = (Waiter)ac.getBean("proxyWaiter");
	
		proxyWaiter.greetTo();
		proxyWaiter.serveTo();
		
	}
}
