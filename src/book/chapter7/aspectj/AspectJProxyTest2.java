package book.chapter7.aspectj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AspectJProxyTest2 {
	public static void main(String[] args) {
		ApplicationContext ac =
					new GenericXmlApplicationContext("classpath:book/chapter7/aspectj/beans.xml");
		
		
		Waiter waiter = (Waiter)ac.getBean("waiterTarget");
		waiter.greetTo("linuo");
		waiter.serveTo("linuoo");
	}
}
