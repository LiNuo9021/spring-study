package review;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
	public static void main(String[] args){
		ApplicationContext ac = new GenericXmlApplicationContext("classpath:review/beans.xml");
		Waiter waiter = (Waiter)ac.getBean("proxyWaiter");
		waiter.serveTo("linuo");
	}	

}
