package book.chapter6.aop.advisor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AdvisorSample {
	public static void main(String[] args) {
		ApplicationContext ac = new GenericXmlApplicationContext("classpath:book/chapter6/aop/advisor/advisor.xml");
		
		Waiter waiter = (Waiter)ac.getBean("proxyWaiter");
		waiter.greet();
		waiter.serve();
		
		Seller seller = (Seller)ac.getBean("proxySeller");
		seller.greet();
		seller.serve();
		
		
		
	}
}
