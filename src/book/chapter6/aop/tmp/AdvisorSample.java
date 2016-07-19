package book.chapter6.aop.tmp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AdvisorSample {
	public static void main(String[] args) {
//		ApplicationContext ac = new GenericXmlApplicationContext("classpath:book/chapter6/aop/tmp/beans.xml");
//		ApplicationContext ac = new GenericXmlApplicationContext("classpath:book/chapter6/aop/tmp/dynamicAdvisor.xml");
//		ApplicationContext ac = new GenericXmlApplicationContext("classpath:book/chapter6/aop/tmp/controlFlowAdvisor.xml");
		ApplicationContext ac = new GenericXmlApplicationContext("classpath:book/chapter6/aop/tmp/composableAdvisor.xml");
		
		Waiter waiter = (Waiter)ac.getBean("waiter");
		waiter.greetTo("li");
		waiter.serveTo("linuo");
//		waiter.serveTo("wangnuo");
//		waiter.serveTo("li");
		
		WaiterDelegate wd = new WaiterDelegate();
		wd.setWaiter(waiter);
		wd.service("linuoo");
		
		
//		Seller seller = (Seller)ac.getBean("seller");
//		seller.greetTo("li");
//		seller.serveTo("linuo");
	}
}
