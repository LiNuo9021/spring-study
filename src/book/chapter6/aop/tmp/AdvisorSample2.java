package book.chapter6.aop.tmp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AdvisorSample2 {
	public static void main(String[] args) {
//		ApplicationContext ac = 
//				new GenericXmlApplicationContext("classpath:book/chapter6/aop/tmp/beanNameAutoProxyCreator.xml");
		ApplicationContext ac = 
				new GenericXmlApplicationContext("classpath:book/chapter6/aop/tmp/defaultAdvisorAutoProxyCreator.xml");
	
		Waiter waiter = (Waiter)ac.getBean("waiterTarget");
		waiter.greetTo("linuo");
		waiter.serveTo("linuoo");
		
		Seller seller = (Seller)ac.getBean("sellerTarget");
		seller.greetTo("hello");
		seller.serveTo("helloo");
		
//		Waiter waiterErr = (Waiter)ac.getBean("waiterTargetErr");
//		waiterErr.greetTo("linuo");
//		waiterErr.serveTo("linuoo");
	}
}
