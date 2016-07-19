package book.chapter6.aop.advise.introduce;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class IntroductWaiterAdivisorSample {
	public static void main(String[] args) {
		ApplicationContext ac = new GenericXmlApplicationContext("classpath:book/chapter6/aop/advise/introduce/advise.xml");

		Waiter waiter = (Waiter)ac.getBean("introductWaiter");
	
		waiter.serveTo();
		
		Monitor monitor = (Monitor)waiter;//神奇
		
		monitor.setMonitor(true);
		
		waiter.serveTo();
	
	}
}
